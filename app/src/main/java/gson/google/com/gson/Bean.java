package gson.google.com.gson;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by qiaomu on 2018/1/18.
 */

public class Bean {


    /**
     * success : true
     * nowDate : 2018-01-18 16:57:12
     * jumpLogin : false
     * infoClientSimpleLlist : [{"id":1261327,"logoUrl":"http://mapi.91alli.com/image.resource?ownerId=1261327&timestamp=1516265816000","title":"今日大神","shortTitle":"今日大神","linkUrl":"http://mp.weixin.qq.com/s/IjWe8FrDwGLi_nliWH6KUw","orderValue":250},{"id":1261331,"logoUrl":"http://mapi.91alli.com/image.resource?ownerId=1261331&timestamp=1516265806000","title":"今日之最","shortTitle":"今日之最","linkUrl":"http://mp.weixin.qq.com/s/kPOlqk4kqRO1CFzduQ17fg","orderValue":240},{"id":1261332,"logoUrl":"http://mapi.91alli.com/image.resource?ownerId=1261332&timestamp=1516265806000","title":"竞猜大学开课啦","shortTitle":"竞猜大学独家分析！","linkUrl":"http://mp.weixin.qq.com/s/_iB9t2uyCmv-b3Zia2ClEg","orderValue":239},{"id":1261311,"logoUrl":"http://mapi.91alli.com/image.resource?ownerId=1261311&timestamp=1516265781000","title":"助威新玩法！","linkUrl":"http://mp.weixin.qq.com/s/rUaeGo2UZMDrOJdeTl6W5g","orderValue":238},{"id":1261329,"logoUrl":"http://mapi.91alli.com/image.resource?ownerId=1261329&timestamp=1516265822000","title":"发单人规范","linkUrl":"https://mp.weixin.qq.com/s/2CZ8fWR4Vz8MEvO8GO-YgA","orderValue":237.1}]
     */

    public boolean success;
    public String nowDate;
    public boolean jumpLogin;

    public boolean isEmpty;
    public JSONObject mObject;

    @Override
    public String toString() {
        return "Bean{" +
                "success=" + success +
                ", nowDate='" + nowDate + '\'' +
                ", jumpLogin=" + jumpLogin +
                ", infoClientSimpleLlist=" + infoClientSimpleLlist.toString() +
                '}';
    }

    public List<InfoClientSimpleLlistBean> infoClientSimpleLlist;

    public static class InfoClientSimpleLlistBean {
        /**
         * id : 1261327
         * logoUrl : http://mapi.91alli.com/image.resource?ownerId=1261327&timestamp=1516265816000
         * title : 今日大神
         * shortTitle : 今日大神
         * linkUrl : http://mp.weixin.qq.com/s/IjWe8FrDwGLi_nliWH6KUw
         * orderValue : 250
         */

        public String id;
        public String logoUrl;
        public String title;

        @Override
        public String toString() {
            return "InfoClientSimpleLlistBean{" +
                    "id=" + id +
                    ", logoUrl='" + logoUrl + '\'' +
                    ", title='" + title + '\'' +
                    ", shortTitle='" + shortTitle + '\'' +
                    ", linkUrl='" + linkUrl + '\'' +
                    ", orderValue=" + orderValue +
                    '}';
        }

        public String shortTitle;
        public String linkUrl;
        public String orderValue;
    }
}
