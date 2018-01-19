package gson.google.com.gson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private static final String RESPONSE = "{\"success\":true,\"nowDate\":\"2018-01-18 16:57:12\",\"jumpLogin\":false,\"infoClientSimpleLlist\":[{\"id\":1261327,\"logoUrl\":\"http:\\/\\/mapi.91alli.com\\/image.resource?ownerId=1261327&timestamp=1516265816000\",\"title\":\"今日大神\",\"shortTitle\":\"今日大神\",\"linkUrl\":\"http:\\/\\/mp.weixin.qq.com\\/s\\/IjWe8FrDwGLi_nliWH6KUw\",\"orderValue\":250},{\"id\":1261331,\"logoUrl\":\"http:\\/\\/mapi.91alli.com\\/image.resource?ownerId=1261331&timestamp=1516265806000\",\"title\":\"今日之最\",\"shortTitle\":\"今日之最\",\"linkUrl\":\"http:\\/\\/mp.weixin.qq.com\\/s\\/kPOlqk4kqRO1CFzduQ17fg\",\"orderValue\":240},{\"id\":1261332,\"logoUrl\":\"http:\\/\\/mapi.91alli.com\\/image.resource?ownerId=1261332&timestamp=1516265806000\",\"title\":\"竞猜大学开课啦\",\"shortTitle\":\"竞猜大学独家分析！\",\"linkUrl\":\"http:\\/\\/mp.weixin.qq.com\\/s\\/_iB9t2uyCmv-b3Zia2ClEg\",\"orderValue\":239},{\"id\":1261311,\"logoUrl\":\"http:\\/\\/mapi.91alli.com\\/image.resource?ownerId=1261311&timestamp=1516265781000\",\"title\":\"助威新玩法！\",\"linkUrl\":\"http:\\/\\/mp.weixin.qq.com\\/s\\/rUaeGo2UZMDrOJdeTl6W5g\",\"orderValue\":238},{\"id\":1261329,\"logoUrl\":\"http:\\/\\/mapi.91alli.com\\/image.resource?ownerId=1261329&timestamp=1516265822000\",\"title\":\"发单人规范\",\"linkUrl\":\"https:\\/\\/mp.weixin.qq.com\\/s\\/2CZ8fWR4Vz8MEvO8GO-YgA\",\"orderValue\":237.1}]}";


    private static String LIST_RESPONSE = "{\n" +
            "success: true,\n" +
            "nowDate: \"2018-01-19 14:28:21\",\n" +
            "jumpLogin: false,\n" +
            "normalPurchaseOrders: [\n" +
            "{\n" +
            "purchaseNo: \"67012018011807357764\",\n" +
            "issueNo: \"20180120\",\n" +
            "ownerUserId: \"8201711152338949\",\n" +
            "ownerAlias: \"真稳赢收米团\",\n" +
            "createrAlias: \"真稳赢收米团\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 100008,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 100008,\n" +
            "multiple: 50004,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-18 22:46:14\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"恭喜4连红没有悬念拿下！5连红没有悬念，几天前一直在收集数据，确定必中，高倍单拿回第一单关大神称号！\",\n" +
            "gmtStopSell: \"2018-01-20 22:50:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 1,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-20 22:50:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201711152338949&mt=1512534765000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 4,\n" +
            "userMedalList: [\n" +
            "{\n" +
            "imageName: \"CONTINUE_RED_CR3\",\n" +
            "calValue: 3,\n" +
            "userId: \"8201711152338949\",\n" +
            "medalCode: \"CONTINUE_RED\",\n" +
            "configCode: \"CR3\",\n" +
            "configName: \"3连红\",\n" +
            "medalName: \"连红勋章\",\n" +
            "orderValue: 3,\n" +
            "userMedalUrl: \"http://mapi.91alli.com/userMedalPic.resource?byteName=CONTINUE_RED_CR3_M&timestamp=1512356561000\"\n" +
            "}\n" +
            "],\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907366527\",\n" +
            "issueNo: \"20180120\",\n" +
            "ownerUserId: \"8201711152338803\",\n" +
            "ownerAlias: \"战狼足彩心水\",\n" +
            "createrAlias: \"战狼足彩心水\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 50008,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 50008,\n" +
            "multiple: 25004,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 09:59:22\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"早场单8点单！3连红单！这单从初盘看到现在确定八九不离十的，苦心钻研只为红单！没有任何意外！红！！！\",\n" +
            "gmtStopSell: \"2018-01-20 19:50:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 1,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-20 19:50:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201711152338803&mt=1512534452000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 4,\n" +
            "userMedalList: [\n" +
            "{\n" +
            "imageName: \"CONTINUE_RED_CR2\",\n" +
            "calValue: 2,\n" +
            "userId: \"8201711152338803\",\n" +
            "medalCode: \"CONTINUE_RED\",\n" +
            "configCode: \"CR2\",\n" +
            "configName: \"2连红\",\n" +
            "medalName: \"连红勋章\",\n" +
            "orderValue: 3,\n" +
            "userMedalUrl: \"http://mapi.91alli.com/userMedalPic.resource?byteName=CONTINUE_RED_CR2_M&timestamp=1512356561000\"\n" +
            "}\n" +
            "],\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907371268\",\n" +
            "issueNo: \"20180120\",\n" +
            "ownerUserId: \"8201712052361539\",\n" +
            "ownerAlias: \"第一大神\",\n" +
            "createrAlias: \"第一大神\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 40008,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 40008,\n" +
            "multiple: 20004,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 13:42:28\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"90分钟绝杀了我的7倍单！连续3次错一场，这次只发一场，不存在不中可能性！运气不会永远背！重注！\",\n" +
            "gmtStopSell: \"2018-01-20 22:20:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 1,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-20 22:20:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201712052361539&mt=1512534654000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011807347784\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201712072364790\",\n" +
            "ownerAlias: \"真竞彩第一高手\",\n" +
            "createrAlias: \"真竞彩第一高手\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 30088,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 30088,\n" +
            "multiple: 15044,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-18 18:45:44\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"5倍爆炸单！直接重注！相信的跟！\",\n" +
            "gmtStopSell: \"2018-01-19 23:50:00\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 23:50:00\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201712072364790&mt=1512877702000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: 3,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 4,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907371021\",\n" +
            "issueNo: \"20180121\",\n" +
            "ownerUserId: \"8201711152338039\",\n" +
            "ownerAlias: \"小女子玩竞彩\",\n" +
            "createrAlias: \"小女子玩竞彩\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 20600,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 20600,\n" +
            "multiple: 10300,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 13:34:40\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"【收集整理资料5小时，两队近期10场比赛视频回放，100%把握！可重注！】\",\n" +
            "gmtStopSell: \"2018-01-21 18:50:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 1,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-21 18:50:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201711152338039&mt=1513765647000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907370955\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201712162372702\",\n" +
            "ownerAlias: \"球王淡定\",\n" +
            "createrAlias: \"球王淡定\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 10088,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 10088,\n" +
            "multiple: 5044,\n" +
            "lotterySubType: {\n" +
            "name: \"JCLQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCLQ\",\n" +
            "message: \"竞彩篮球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 13:31:53\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"此单十成把握，必红单，我加注，老铁们跟上节奏\",\n" +
            "gmtStopSell: \"2018-01-20 09:40:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-20 09:40:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201712162372702&mt=1513496335000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: 2.8,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907368318\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201801102383604\",\n" +
            "ownerAlias: \"ohh\",\n" +
            "createrAlias: \"ohh\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 8000,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 8000,\n" +
            "multiple: 4000,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 11:17:46\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"最后嗦一单。 上榜之后2连黑。对不起跟单的兄弟。\",\n" +
            "gmtStopSell: \"2018-01-19 23:50:00\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 23:50:00\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201801102383604&mt=1515582814000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: 2.8,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 2,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011807346146\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201712032360170\",\n" +
            "ownerAlias: \"平台人气王\",\n" +
            "createrAlias: \"平台人气王\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 7288,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 7288,\n" +
            "multiple: 3644,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-18 17:18:27\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"赔率:3倍，信者跟，直接干满，拒绝再黑(上一单差了一点点运气)\",\n" +
            "gmtStopSell: \"2018-01-19 15:50:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 15:50:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201712032360170&mt=1512473171000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 3,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907370760\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201712132370954\",\n" +
            "ownerAlias: \"吴式彩业\",\n" +
            "createrAlias: \"吴式彩业\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 5000,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 5000,\n" +
            "multiple: 2500,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 13:25:32\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"竞彩大杀 3sp\",\n" +
            "gmtStopSell: \"2018-01-19 23:50:00\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 23:50:00\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201712132370954&mt=1513170357000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "userMedalList: [\n" +
            "{\n" +
            "imageName: \"CONTINUE_RED_CR2\",\n" +
            "calValue: 2,\n" +
            "userId: \"8201712132370954\",\n" +
            "medalCode: \"CONTINUE_RED\",\n" +
            "configCode: \"CR2\",\n" +
            "configName: \"2连红\",\n" +
            "medalName: \"连红勋章\",\n" +
            "orderValue: 3,\n" +
            "userMedalUrl: \"http://mapi.91alli.com/userMedalPic.resource?byteName=CONTINUE_RED_CR2_M&timestamp=1512356561000\"\n" +
            "}\n" +
            "],\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907368729\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201801102382448\",\n" +
            "ownerAlias: \"鴻運當頭k\",\n" +
            "createrAlias: \"鴻運當頭k\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 3210,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 3210,\n" +
            "multiple: 1605,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 11:40:34\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"SP2.4生命不息，红单不止。感谢大家对我的认可，我只有拿红单回馈大家！\",\n" +
            "gmtStopSell: \"2018-01-19 23:50:00\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 23:50:00\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201801102382448&mt=1515566685000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: 2.4,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907364374\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201711182346547\",\n" +
            "ownerAlias: \"仟亿投资集团\",\n" +
            "createrAlias: \"仟亿投资集团\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 3000,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 3000,\n" +
            "multiple: 1500,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 07:29:32\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"近期5倍以上3中2，还是5倍的稳！\",\n" +
            "gmtStopSell: \"2018-01-19 23:50:00\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 3,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 23:50:00\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201711182346547&mt=1511277559000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: 4.6,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011807351945\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201711152339264\",\n" +
            "ownerAlias: \"剧本大导演\",\n" +
            "createrAlias: \"剧本大导演\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 2188,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 2188,\n" +
            "multiple: 1094,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-18 21:08:20\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"赔率3+信心单\",\n" +
            "gmtStopSell: \"2018-01-19 23:50:00\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 23:50:00\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201711152339264&mt=1512611494000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 2,\n" +
            "userMedalList: [\n" +
            "{\n" +
            "imageName: \"CONTINUE_RED_CR2\",\n" +
            "calValue: 2,\n" +
            "userId: \"8201711152339264\",\n" +
            "medalCode: \"CONTINUE_RED\",\n" +
            "configCode: \"CR2\",\n" +
            "configName: \"2连红\",\n" +
            "medalName: \"连红勋章\",\n" +
            "orderValue: 3,\n" +
            "userMedalUrl: \"http://mapi.91alli.com/userMedalPic.resource?byteName=CONTINUE_RED_CR2_M&timestamp=1512356561000\"\n" +
            "}\n" +
            "],\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011807345994\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201801142387436\",\n" +
            "ownerAlias: \"亮瞎你的18k\",\n" +
            "createrAlias: \"亮瞎你的18k\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 2000,\n" +
            "singleTotalFee: 2,\n" +
            "totalPaidFee: 2000,\n" +
            "multiple: 1000,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-18 17:08:14\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "title: \"认真出好没一单 稳重收米\",\n" +
            "gmtStopSell: \"2018-01-19 23:50:00\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 2,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 23:50:00\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201801142387436&mt=1515928815000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: 2,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011907371823\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201711152337576\",\n" +
            "ownerAlias: \"嘟嘟哥哥归来\",\n" +
            "createrAlias: \"嘟嘟哥哥归来\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 2000,\n" +
            "singleTotalFee: 8,\n" +
            "totalPaidFee: 2000,\n" +
            "multiple: 250,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-19 14:02:20\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "gmtStopSell: \"2018-01-19 15:50:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 6,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 15:50:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201711152337576&mt=1512474554000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: 5,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "},\n" +
            "{\n" +
            "purchaseNo: \"67012018011807349001\",\n" +
            "issueNo: \"20180119\",\n" +
            "ownerUserId: \"8201801142387091\",\n" +
            "ownerAlias: \"土豪的壕\",\n" +
            "createrAlias: \"土豪的壕\",\n" +
            "createrPaidFee: 0,\n" +
            "totalFee: 1080,\n" +
            "singleTotalFee: 18,\n" +
            "totalPaidFee: 1080,\n" +
            "multiple: 60,\n" +
            "lotterySubType: {\n" +
            "name: \"JCZQ_HHGG\",\n" +
            "message: \"混合过关\"\n" +
            "},\n" +
            "lotteryType: {\n" +
            "name: \"JCZQ\",\n" +
            "message: \"竞彩足球\"\n" +
            "},\n" +
            "prizeStatusMessage: \"未开奖\",\n" +
            "drawStatusMessage: [\n" +
            "\"成功\",\n" +
            "\"已经出票\"\n" +
            "],\n" +
            "gmtCreate: \"2018-01-18 19:32:28\",\n" +
            "prizeFee: 0,\n" +
            "myPrizeFee: 0,\n" +
            "totalAmount: 0,\n" +
            "prized: false,\n" +
            "prizeAmount: 0,\n" +
            "gmtStopSell: \"2018-01-19 16:40:01\",\n" +
            "commissionRate: 0,\n" +
            "drawSingleFee: 0,\n" +
            "createType: {\n" +
            "name: \"SINGLE\",\n" +
            "message: \"代购\"\n" +
            "},\n" +
            "entryAmount: 8,\n" +
            "copy: true,\n" +
            "copyCommissionRate: 0.1,\n" +
            "totalCopyCommissionFee: 0,\n" +
            "combine: false,\n" +
            "gmtStopCopy: \"2018-01-19 16:40:01\",\n" +
            "maybeCopiedByUser: true,\n" +
            "copyable: true,\n" +
            "combineable: false,\n" +
            "userLogoUrl: \"http://mapi.91alli.com/userLogo.resource?userId=8201801142387091&mt=1515987810000\",\n" +
            "publicize: false,\n" +
            "profitProtectRate: -1,\n" +
            "properties: { },\n" +
            "totalCopyAmount: 0,\n" +
            "copyHotLevel: 1,\n" +
            "payStatus: {\n" +
            "name: \"FREEZE_FINISH\",\n" +
            "message: \"冻结结束\"\n" +
            "},\n" +
            "cancel: false\n" +
            "}\n" +
            "],\n" +
            "paginator: {\n" +
            "page: 1,\n" +
            "items: 27,\n" +
            "itemsPerPage: 15,\n" +
            "pages: 2\n" +
            "}\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        try {
            JSONObject jsonObject = new JSONObject(LIST_RESPONSE);
            jsonObject.put("request_header", "http://mapi.91alli.com/client/service.json?appCode=pandasport&authedUserId=8201712272378903&currentPage=1&loginKey=USLaa3d133dda6d4f54987e669303a37d6e&roleName=%E4%B9%94%E6%9C%A8New&service=PURCHASE_ORDER_JOINABLE_QUERY&sign=a3206fa26440e4838255c5c1e0e073b5");
            ListBean listBean = gson.fromJson(jsonObject.toString(), ListBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
