import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * created date 2020/2/13 10:15
 *
 * @author maxiaowei
 */
public class TestDemo {

    public static void main(String[] args) {
        wchat();
//        Map<String, Integer> map = new HashMap<>();
//        map.put("addd", 1);
//        map.put("bbb", 1);
//        map.put("ccc", 1);
//        String str = JSON.toJSONString(map);
//
//        String res = HttpUtil.post("www.baidu.com", str);
//        System.out.println();
//        String[] str = new String[]{"type", "campaign_id", "campaign_name", "adgroup_id", "adgroup_name", "keyword_id",
//                "keyword",
//                "views", "clicks", "totalCost", "price", "match_type",
//                "destination_url",
//                "mobile_destination_url", "opt_status", "status", "mobile_status",
//                "cause",
//                "pc_lowest_price",
//                "pc_left3_price", "pc_left_price", "add_time", "update_time",};
//        String[] cn = new String[]{"关键词报告的投放端类型", "推广计划ID", "推广计划", "推广组ID", "推广组", "关键词id",
//                "关键词",
//                "展现", "点击", "消费", "PC端关键词出价", "关键词匹配模式",
//                "PC端关键词访问URL",
//                "移动端关键词访问URL", "关键词启用/暂停状态", "PC端关键词状态", "移动端关键词状态",
//                "审核拒绝理由",
//                "低于此出价将有可能得不到计算机展现机会",
//        "PC左侧前三建议价","PC左侧展现建议价","关键词添加时间","关键词最近更新时间"};
//        for (int i = 0; i < str.length; i++) {
//            System.out.println("`" + str[i] + "` STRING COMMENT '" + cn[i] + "',");
//        }
//
//        String sssss = " " +
//                "    `type` STRING COMMENT '关键词报告的投放端类型',\n" +
//                "    `campaign_id` STRING COMMENT '推广计划ID',\n" +
//                "    `campaign_name` STRING COMMENT '推广计划',\n" +
//                "    `adgroup_id` STRING COMMENT '推广组ID',\n" +
//                "    `adgroup_name` STRING COMMENT '推广组',\n" +
//                "    `keyword_id` STRING COMMENT '关键词id',\n" +
//                "    `keyword` STRING COMMENT '关键词',\n" +
//                "    `views` STRING COMMENT '展现',\n" +
//                "    `clicks` STRING COMMENT '点击',\n" +
//                "    `totalCost` STRING COMMENT '消费',\n" +
//                "    `price` STRING COMMENT 'PC端关键词出价',\n" +
//                "    `match_type` STRING COMMENT '关键词匹配模式',\n" +
//                "    `destination_url` STRING COMMENT 'PC端关键词访问URL',\n" +
//                "    `mobile_destination_url` STRING COMMENT '移动端关键词访问URL',\n" +
//                "    `opt_status` STRING COMMENT '关键词启用/暂停状态',\n" +
//                "    `status` STRING COMMENT 'PC端关键词状态',\n" +
//                "    `mobile_status` STRING COMMENT '移动端关键词状态',\n" +
//                "    `cause` STRING COMMENT '审核拒绝理由',\n" +
//                "    `pc_lowest_price` STRING COMMENT '低于此出价将有可能得不到计算机展现机会',\n" +
//                "    `pc_left3_price` STRING COMMENT 'PC左侧前三建议价',\n" +
//                "    `pc_left_price` STRING COMMENT 'PC左侧展现建议价',\n" +
//                "    `add_time` STRING COMMENT '关键词添加时间',\n" +
//                "    `update_time` STRING COMMENT '关键词最近更新时间')\n";
//        String[] arr = sssss.split(",");
//        for (String  a : arr){
//            String key = a.substring(a.indexOf("`")+1, a.lastIndexOf("`"));
//            String value = a.substring(a.indexOf("'")+1, a.lastIndexOf("'"));
//            System.out.println(key + ".append(keyword_info['" + key  +"'])" );
//        }

//        for (String  a : arr){
//            String key = a.substring(a.indexOf("`")+1, a.lastIndexOf("`"));
//            String value = a.substring(a.indexOf("'")+1, a.lastIndexOf("'"));
//            System.out.println(key + " = []" );
//        }
//
//        for (String  a : arr){
//            String key = a.substring(a.indexOf("`")+1, a.lastIndexOf("`"));
//            String value = a.substring(a.indexOf("'")+1, a.lastIndexOf("'"));
//            System.out.print(key + "," );
//        }

    }


    public static void wchat(){
        String str = "date\n" +
                "string\t日期，日期格式：YYYY-MM-DD, 仅支持微信公众平台广告主\n" +
                "wechat_account_id\n" +
                "string\t微信账号id, 仅支持微信公众平台广告主\n" +
                "wechat_agency_id\n" +
                "string\t微信服务商id, 仅支持微信公众平台广告主\n" +
                "campaign_id\n" +
                "integer\t推广计划id, 仅支持微信公众平台广告主\n" +
                "adgroup_id\n" +
                "integer\t广告组id, 仅支持微信公众平台广告主\n" +
                "ad_id\n" +
                "integer\t广告id, 仅支持微信公众平台广告主\n" +
                "cost_deviation_rate\n" +
                "float\t当日成本偏差, 仅支持微信公众平台广告主\n" +
                "cost\n" +
                "integer\t花费, 仅支持微信公众平台广告主\n" +
                "compensation_amount\n" +
                "integer\t赔付金额, 仅支持微信公众平台广告主\n" +
                "view_count\n" +
                "integer\t曝光量, 仅支持微信公众平台广告主\n" +
                "thousand_display_price\n" +
                "integer\t千次展现均价, 仅支持微信公众平台广告主\n" +
                "view_user_count\n" +
                "integer\t曝光人数, 仅支持微信公众平台广告主\n" +
                "avg_view_per_user\n" +
                "float\t人均曝光次数, 仅支持微信公众平台广告主\n" +
                "special_page_exp_uv\n" +
                "integer\t指定页面曝光人数, 仅支持微信公众平台广告主\n" +
                "special_page_exp_cost\n" +
                "integer\t指定页面曝光成本, 仅支持微信公众平台广告主\n" +
                "valid_click_count\n" +
                "integer\t点击量, 仅支持微信公众平台广告主\n" +
                "click_user_count\n" +
                "integer\t点击人数, 仅支持微信公众平台广告主\n" +
                "ctr\n" +
                "float\t点击率, 仅支持微信公众平台广告主\n" +
                "cpc\n" +
                "integer\t点击均价, 仅支持微信公众平台广告主\n" +
                "valuable_click_count\n" +
                "integer\t可转化点击次数, 仅支持微信公众平台广告主\n" +
                "valuable_click_rate\n" +
                "float\t可转化点击率, 仅支持微信公众平台广告主\n" +
                "valuable_click_cost\n" +
                "integer\t可转化点击成本, 仅支持微信公众平台广告主\n" +
                "click_image_count\n" +
                "integer\t外层图片点击次数, 仅支持微信公众平台广告主\n" +
                "image_click_user_count\n" +
                "integer\t创意素材图片点击人数, 仅支持微信公众平台广告主\n" +
                "video_play_count\n" +
                "integer\t, 仅支持微信公众平台广告主\n" +
                "video_click_user_count\n" +
                "integer\t创意素材视频点击人数, 仅支持微信公众平台广告主\n" +
                "click_detail_count\n" +
                "integer\t文字链点击次数, 仅支持微信公众平台广告主\n" +
                "link_click_user_count\n" +
                "integer\t文字链点击人数, 仅支持微信公众平台广告主\n" +
                "click_head_count\n" +
                "integer\t头像点击次数, 仅支持微信公众平台广告主\n" +
                "portrait_click_user_count\n" +
                "integer\t头像点击人数, 仅支持微信公众平台广告主\n" +
                "click_nick_count\n" +
                "integer\t昵称点击次数, 仅支持微信公众平台广告主\n" +
                "nickname_click_user_count\n" +
                "integer\t昵称点击人数, 仅支持微信公众平台广告主\n" +
                "click_poi_count\n" +
                "integer\t本地门店点击量, 仅支持微信公众平台广告主\n" +
                "poi_click_user_count\n" +
                "integer\t门店点击人数, 仅支持微信公众平台广告主\n" +
                "platform_key_page_view_count\n" +
                "integer\t平台页关键页面浏览量, 仅支持微信公众平台广告主\n" +
                "platform_key_page_view_user_count\n" +
                "integer\t平台页关键页面浏览人数, 仅支持微信公众平台广告主\n" +
                "platform_key_page_view_rate\n" +
                "float\t平台页关键页面曝光率, 仅支持微信公众平台广告主\n" +
                "platform_key_page_avg_view_per_user\n" +
                "float\t平台页关键页面人均曝光次数, 仅支持微信公众平台广告主\n" +
                "platform_key_page_view_duration\n" +
                "float\t平台页关键页面人均曝光时长, 仅支持微信公众平台广告主\n" +
                "cpn_click_button_count\n" +
                "integer\t平台落地页跳转按钮点击次数, 仅支持微信公众平台广告主\n" +
                "cpn_click_button_uv\n" +
                "integer\t平台落地页跳转按钮点击人数, 仅支持微信公众平台广告主\n" +
                "cpn_click_button_cost\n" +
                "integer\t平台页跳转按钮点击成本, 仅支持微信公众平台广告主\n" +
                "praise_count\n" +
                "integer\t点赞量, 仅支持微信公众平台广告主\n" +
                "praise_user_count\n" +
                "integer\t点赞人数, 仅支持微信公众平台广告主\n" +
                "comment_count\n" +
                "integer\t评论量, 仅支持微信公众平台广告主\n" +
                "comment_user_count\n" +
                "integer\t评论人数, 仅支持微信公众平台广告主\n" +
                "conversions_count\n" +
                "integer\t目标转化量, 仅支持微信公众平台广告主\n" +
                "conversions_cost\n" +
                "integer\t目标转化成本, 仅支持微信公众平台广告主\n" +
                "conversions_rate\n" +
                "float\t目标转化率, 仅支持微信公众平台广告主\n" +
                "deep_conversions_count\n" +
                "integer\t深度转化量, 仅支持微信公众平台广告主\n" +
                "deep_conversions_cost\n" +
                "integer\t深度转化成本, 仅支持微信公众平台广告主\n" +
                "deep_conversions_rate\n" +
                "float\t深度目标转化率, 仅支持微信公众平台广告主\n" +
                "view_key_page_uv\n" +
                "integer\t自有落地页关键页面浏览人数, 仅支持微信公众平台广告主\n" +
                "download_count\n" +
                "integer\tAPP下载完成量, 仅支持微信公众平台广告主\n" +
                "download_cost\n" +
                "integer\tAPP下载成本, 仅支持微信公众平台广告主\n" +
                "install_count\n" +
                "integer\tAPP安装量, 仅支持微信公众平台广告主\n" +
                "install_rate\n" +
                "float\tAPP安装率, 仅支持微信公众平台广告主\n" +
                "install_cost\n" +
                "integer\tAPP安装成本, 仅支持微信公众平台广告主\n" +
                "activated_count\n" +
                "integer\tAPP激活总量, 仅支持微信公众平台广告主\n" +
                "activated_rate\n" +
                "float\tAPP下载激活率, 仅支持微信公众平台广告主\n" +
                "activated_cost\n" +
                "integer\tAPP激活成本, 仅支持微信公众平台广告主\n" +
                "app_register_count\n" +
                "integer\t注册量（APP）, 仅支持微信公众平台广告主\n" +
                "app_register_cost\n" +
                "integer\t注册成本（APP）, 仅支持微信公众平台广告主\n" +
                "app_add_to_cart_count\n" +
                "integer\t加入购物车量（APP）, 仅支持微信公众平台广告主\n" +
                "app_checkout_count\n" +
                "integer\t付费行为量（APP）, 仅支持微信公众平台广告主\n" +
                "app_checkout_amount\n" +
                "integer\t付费金额（APP）, 仅支持微信公众平台广告主\n" +
                "first_pay_count\n" +
                "integer\t首次付费行为人数, 仅支持微信公众平台广告主\n" +
                "first_pay_cost\n" +
                "integer\t首次付费成本, 仅支持微信公众平台广告主\n" +
                "retention_count\n" +
                "integer\t次日留存人数（APP）, 仅支持微信公众平台广告主\n" +
                "retention_cost\n" +
                "integer\t次日留存成本（APP）, 仅支持微信公众平台广告主\n" +
                "app_withdraw_uv\n" +
                "integer\t金融提现行为人数（APP）, 仅支持微信公众平台广告主\n" +
                "app_apply_uv\n" +
                "integer\t金融完件人数（APP）, 仅支持微信公众平台广告主\n" +
                "app_pre_credit_uv\n" +
                "integer\t金融预授信人数（APP）, 仅支持微信公众平台广告主\n" +
                "app_credit_uv\n" +
                "integer\t金融授信人数（APP）, 仅支持微信公众平台广告主\n" +
                "order_count\n" +
                "integer\t下单量, 仅支持微信公众平台广告主\n" +
                "first_day_order_count\n" +
                "integer\t首日新增下单量, 仅支持微信公众平台广告主\n" +
                "web_order_cost\n" +
                "integer\t下单成本（网页）, 仅支持微信公众平台广告主\n" +
                "order_rate\n" +
                "float\t下单率, 仅支持微信公众平台广告主\n" +
                "order_amount\n" +
                "integer\t下单金额, 仅支持微信公众平台广告主\n" +
                "first_day_order_amount\n" +
                "integer\t首日新增下单金额, 仅支持微信公众平台广告主\n" +
                "order_unit_price\n" +
                "integer\t下单单价, 仅支持微信公众平台广告主\n" +
                "order_roi\n" +
                "float\t下单花费回报(ROI), 仅支持微信公众平台广告主\n" +
                "sign_in_count\n" +
                "integer\t订单签收量, 仅支持微信公众平台广告主\n" +
                "add_wishlist_count\n" +
                "integer\t加收藏次数, 仅支持微信公众平台广告主\n" +
                "view_commodity_page_uv\n" +
                "integer\t自有落地页商品页浏览人数（网页）, 仅支持微信公众平台广告主\n" +
                "page_reservation_count\n" +
                "integer\t表单预约量, 仅支持微信公众平台广告主\n" +
                "quest_reservation_pv_cost\n" +
                "integer\t销售线索成本, 仅支持微信公众平台广告主\n" +
                "leads_rate\n" +
                "float\t销售线索转化率（次数）, 仅支持微信公众平台广告主\n" +
                "leads_user_count\n" +
                "integer\t销售线索人数, 仅支持微信公众平台广告主\n" +
                "leads_cost\n" +
                "integer\t销售线索成本（人数）, 仅支持微信公众平台广告主\n" +
                "leads_user_rate\n" +
                "float\t销售线索转化率（人数）, 仅支持微信公众平台广告主\n" +
                "valid_leads_uv\n" +
                "integer\t有效线索人数-表单, 仅支持微信公众平台广告主\n" +
                "valid_leads_cost\n" +
                "integer\t有效销售线索成本, 仅支持微信公众平台广告主\n" +
                "valid_leads_rate\n" +
                "float\t有效销售线索转化率, 仅支持微信公众平台广告主\n" +
                "leads_purchase_uv\n" +
                "integer\t付费销售线索人数, 仅支持微信公众平台广告主\n" +
                "leads_purchase_cost\n" +
                "integer\t付费销售线索成本, 仅支持微信公众平台广告主\n" +
                "leads_purchase_rate\n" +
                "float\t付费销售线索转化率, 仅支持微信公众平台广告主\n" +
                "page_consult_user_count\n" +
                "integer\t在线咨询人数, 仅支持微信公众平台广告主\n" +
                "valid_page_consult_user_count\n" +
                "integer\t有效线索人数-咨询, 仅支持微信公众平台广告主\n" +
                "phone_call_uv\n" +
                "integer\t智能电话拨打人数, 仅支持微信公众平台广告主\n" +
                "valid_phone_uv\n" +
                "integer\t有效线索人数-电话, 仅支持微信公众平台广告主\n" +
                "potential_customer_phone_uv\n" +
                "integer\t潜在客户人数-电话, 仅支持微信公众平台广告主\n" +
                "web_register_uv\n" +
                "integer\t注册人数（网页）, 仅支持微信公众平台广告主\n" +
                "web_apply_uv\n" +
                "integer\t金融完件人数（网页）, 仅支持微信公众平台广告主\n" +
                "web_credit_uv\n" +
                "integer\t金融授信人数（网页）, 仅支持微信公众平台广告主\n" +
                "withdr_dep_web_user_count\n" +
                "integer\t金融提现人数（网页）, 仅支持微信公众平台广告主\n" +
                "scan_follow_count\n" +
                "integer\t扫码关注量, 仅支持微信公众平台广告主\n" +
                "wechat_app_register_uv\n" +
                "integer\t微信小游戏注册人数, 仅支持微信公众平台广告主\n" +
                "wechat_minigame_register_cost\n" +
                "integer\t微信小游戏注册成本（人数）, 仅支持微信公众平台广告主\n" +
                "wechat_minigame_register_rate\n" +
                "float\t微信小游戏注册率, 仅支持微信公众平台广告主\n" +
                "wechat_minigame_arpu\n" +
                "float\t当日新增广告ARPU, 仅支持微信公众平台广告主\n" +
                "wechat_minigame_retention_count\n" +
                "integer\t微信小游戏次留人数, 仅支持微信公众平台广告主\n" +
                "wechat_minigame_checkout_count\n" +
                "integer\t微信小游戏付费次数, 仅支持微信公众平台广告主\n" +
                "wechat_minigame_checkout_amount\n" +
                "integer\t微信小游戏付费金额（元）, 仅支持微信公众平台广告主\n" +
                "official_account_follow_count\n" +
                "integer\t公众号关注次数, 仅支持微信公众平台广告主\n" +
                "official_account_follow_cost\n" +
                "integer\t公众号关注成本（次数）, 仅支持微信公众平台广告主\n" +
                "official_account_follow_rate\n" +
                "float\t公众号关注率, 仅支持微信公众平台广告主\n" +
                "official_account_register_user_count\n" +
                "integer\t公众号内注册人数, 仅支持微信公众平台广告主\n" +
                "official_account_register_rate\n" +
                "float\t公众号内注册比例, 仅支持微信公众平台广告主\n" +
                "official_account_register_cost\n" +
                "integer\t公众号内注册成本（元）, 仅支持微信公众平台广告主\n" +
                "official_account_register_amount\n" +
                "integer\t公众号内注册订单金额（元）, 仅支持微信公众平台广告主\n" +
                "official_account_register_roi\n" +
                "integer\t公众号内注册ROI, 仅支持微信公众平台广告主\n" +
                "official_account_apply_count\n" +
                "integer\t公众号内填单次数, 仅支持微信公众平台广告主\n" +
                "official_account_apply_user_count\n" +
                "integer\t公众号内填单人数, 仅支持微信公众平台广告主\n" +
                "official_account_apply_rate\n" +
                "float\t公众号内填单比例, 仅支持微信公众平台广告主\n" +
                "official_account_apply_cost\n" +
                "integer\t公众号内填单成本（元）, 仅支持微信公众平台广告主\n" +
                "official_account_apply_amount\n" +
                "integer\t公众号内填单金额（元）, 仅支持微信公众平台广告主\n" +
                "official_account_apply_roi\n" +
                "integer\t公众号内填单ROI, 仅支持微信公众平台广告主\n" +
                "official_account_order_count\n" +
                "integer\t公众号内下单次数, 仅支持微信公众平台广告主\n" +
                "official_account_first_day_order_count\n" +
                "integer\t公众号首日内下单次数, 仅支持微信公众平台广告主\n" +
                "official_account_order_user_count\n" +
                "integer\t公众号内下单人数, 仅支持微信公众平台广告主\n" +
                "official_account_order_rate\n" +
                "float\t公众号内下单比例, 仅支持微信公众平台广告主\n" +
                "official_account_order_cost\n" +
                "integer\t公众号内下单成本（元）, 仅支持微信公众平台广告主\n" +
                "official_account_order_amount\n" +
                "integer\t公众号内下单金额（元）, 仅支持微信公众平台广告主\n" +
                "official_account_first_day_order_amount\n" +
                "integer\t公众号首日内下单金额（元）, 仅支持微信公众平台广告主\n" +
                "official_account_order_roi\n" +
                "integer\t公众号内下单ROI, 仅支持微信公众平台广告主\n" +
                "official_account_consult_count\n" +
                "integer\t公众号内发消息人数, 仅支持微信公众平台广告主\n" +
                "official_account_reader_count\n" +
                "integer\t公众号关注用户阅读用户数, 仅支持微信公众平台广告主\n" +
                "official_account_credit_apply_user_count\n" +
                "integer\t公众号内进件人数, 仅支持微信公众平台广告主\n" +
                "official_account_credit_user_count\n" +
                "integer\t公众号内授信人数, 仅支持微信公众平台广告主\n" +
                "platform_coupon_get_count\n" +
                "integer\t平台页领取卡券量, 仅支持微信公众平台广告主\n" +
                "coupon_get_cost\n" +
                "integer\t卡券领取成本（次数）, 仅支持微信公众平台广告主\n" +
                "coupon_get_rate\n" +
                "float\t卡券领取率, 仅支持微信公众平台广告主\n" +
                "coupon_use_count\n" +
                "integer\t卡券使用次数, 仅支持微信公众平台广告主\n" +
                "own_page_coupon_get_count\n" +
                "integer\t自有页领取卡券量, 仅支持微信公众平台广告主\n" +
                "forward_count\n" +
                "integer\t转发量, 仅支持微信公众平台广告主\n" +
                "forward_user_count\n" +
                "integer\t转发人数, 仅支持微信公众平台广告主\n" +
                "no_interest_count\n" +
                "integer\t不感兴趣点击次数, 仅支持微信公众平台广告主\n" +
                "video_outer_play_count\n" +
                "integer\t外层视频播放次数, 仅支持微信公众平台广告主\n" +
                "video_outer_play_user_count\n" +
                "integer\t创意素材视频播放人数, 仅支持微信公众平台广告主\n" +
                "video_inner_play_count\n" +
                "integer\t平台落地页视频点击次数, 仅支持微信公众平台广告主\n" +
                "video_inner_play_user_count\n" +
                "integer\t平台页视频播放人数, 仅支持微信公众平台广告主";

        String [] arr = str.split("\n");
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println("`" + arr[i] + "`  '" + arr[i+1].split("\t")[1].split(",")[0] + "'");
        }
        System.out.println("ok");
    }
}
