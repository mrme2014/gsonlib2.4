package com.google.gson;

import android.text.TextUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 * Created by qiaomu on 2018/1/18.
 */

class Logger {
    private static final String LOG_FILE = "/sdcard/" + BuildConfig.gson_log + ".txt";
    private static final String ARROW_STR = "====>";
    private static final String END_EMPTY = " is Null,should be careful";

    private static final String NEW_LINE = "\r\n\r\n";
    private static final String SPACE = NEW_LINE + NEW_LINE;

    private static final String SERVICE_PARAMS = NEW_LINE + "本次请求的服务名以及参数：";
    private static final String RESPONSE_NULL = NEW_LINE + "本次请求的Response中本应返回却为NULL的字段是：";
    private static final String BEGIN = NEW_LINE + "====================BEGIN=============dateStr=======================BEGIN==================";
    private static final String END = NEW_LINE + "====================END=============dateStr======================END===================";

    public static void gLog(Object object, String requestHeader) {
        if (object == null)
            return;

        String dateStr = getCurDate();

        StringBuilder parentBuilder = new StringBuilder();
        parentBuilder.append(BEGIN.replace("dateStr", dateStr));
        parentBuilder.append(SERVICE_PARAMS + requestHeader);
        parentBuilder.append(RESPONSE_NULL);


        String parentPath = object.getClass().getSimpleName();
        if (isCollection(object)) {
            reflectCollection(parentBuilder, parentPath, object);
        } else {
            reflect(0, parentBuilder, parentPath, object, false);
        }

        parentBuilder.append(END.replace("dateStr", dateStr));
        parentBuilder.append(SPACE);

        log(parentBuilder.toString());
    }

    private static void reflectCollection(StringBuilder parentBuilder, String parentPath, Object collectionObj) {
        Collection collection = (Collection) collectionObj;

        int indexInStep = 0;
        for (Object object1 : collection) {
            reflect(indexInStep, parentBuilder, parentPath, object1, true);
            indexInStep++;
        }
    }

    //                         元素在该层级的路径下标             这次解析承载所有空路径的集合          某一个对象      该对象是否被集合承载
    private static void reflect(int indexInStep, StringBuilder parentBuilder, String parentPath, Object object, boolean isParentCollection) {
        StringBuilder builder = new StringBuilder();
        builder.append(parentPath);

        //如果某个元素是被集合承载的，那么要给这个元素的父路径加上 indexInStep 路径深度下标
        String elementStep = isParentCollection ? "【" + indexInStep + "】" : "";
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);

            String fieldName = field.getName();
            Object value = null;
            try {
                value = field.get(object);
                if (fieldName.startsWith("$"))
                    continue;

                if (value == null) {
                    //到这里 可以说一次for循环的 所有空元素的都在这里了，然后继续下一轮循环
                    parentBuilder.append(NEW_LINE);
                    parentBuilder.append(builder.toString() + elementStep + ARROW_STR + fieldName + END_EMPTY);

                    continue;
                }

                Class<?> valueClass = value.getClass();
                //这些类型的 就没必要递归了 浪费时间
                if (valueClass == Long.class
                        || valueClass == Boolean.class
                        || valueClass == Integer.class
                        || valueClass == String.class
                        || valueClass == Double.class
                        || valueClass == Float.class
                        || valueClass == BigDecimal.class
                        || valueClass == Character.class
                        || valueClass == char.class
                        || valueClass == CharSequence.class
                        || valueClass == Byte.class)
                    continue;

                Class<?> fileType = field.getType();
                boolean isCurFiledCollection = (fileType == List.class || fileType == ArrayList.class || fileType == Collection.class);
                if (isCollection(value)) {

                    reflectCollection(parentBuilder, parentPath + elementStep + ARROW_STR + fieldName, value);
                } else {
                    reflect(0, parentBuilder, parentPath + ARROW_STR + fieldName, value, isCurFiledCollection);
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getCurDate() {
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(calendar.getTime());
    }

    private static boolean isCollection(Object object) {

        return object != null && object instanceof Collection;
    }

    private static void log(String log) {
        if (TextUtils.isEmpty(log))
            return;

        File file = new File(LOG_FILE);
        boolean append = false;
        if (file.exists()) {
            long time = file.lastModified();
            long curTime = System.currentTimeMillis();
            append = curTime - time < 86400000;//超过一天， 清空之前的日志
        }

        try {
            FileOutputStream fos = new FileOutputStream(file, append);
            byte[] bytes = log.getBytes("utf-8");
            fos.write(bytes);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
