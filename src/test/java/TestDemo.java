import java.util.Arrays;

/**
 * created date 2020/2/13 10:15
 *
 * @author maxiaowei
 */
public class TestDemo {

    public static void main(String[] args) {
        String str = "agency_account_id,advertiser_account_id,wechat_campaign_id,wechat_campaign_name,wechat_adgroup_id,wechat_adgroup_name,adgroup_id,promoted_object_type,buying_type,position_id,begin_time,end_time,status,optimization_goal,bid_action_type,total_budget,bid_average,bid_amount,cost,view_pv,view_uv,view_pv_average,click_pv,click_uv,ctr,cpc,conversion_click_pv,conversion_click_pv_rate,conversion_click_pv_cost,image_pv,image_uv,video_click_pv,video_click_uv,link_click_pv,link_click_uv,head_pv,head_uv,nick_pv,nick_uv,poi_pv,poi_uv,canvas_view_pv,canvas_view_uv,canvas_view_pv_rate,canvas_view_pv_average,canvas_viewtime_average,canvas_button_click_pv,canvas_button_click_uv,canvas_button_click_pv_cost,praise_pv,praise_uv,comment_pv,comment_uv,conversion,cpa,cvr,follow_pv,download_complete_pv,download_complete_pv_cost,install_complete_pv,install_complete_pv_cost,activated_pv,activated_pv_cost,app_register_pv,app_register_pv_cost,app_add_to_car_pv,app_checkout_pv,card_coupon_get_pv,card_coupon_use_pv,order_pv,order_amount,order_unit_price,order_roi,leads_pv,leads_uv,valid_leads_pv,valid_leads_pv_cost,valid_leads_pv_rate,wechat_registration_pv,wechat_registration_uv,wechat_registration_uv_rate,wechat_registration_pv_cost,wechat_registration_roi,wechat_leads_pv,wechat_leads_uv,wechat_leads_uv_rate,wechat_leads_pv_cost,wechat_leads_roi,wechat_order_pv,wechat_order_uv,wechat_order_uv_rate,wechat_order_pv_cost,wechat_order_roi,share_pv,share_uv,nointerest_pv,outer_video_play_pv,outer_video_play_uv,canvas_video_play_pv,canvas_video_play_uv,expand_targeting_cost,normal_targeting_cost,expand_targeting_pv,normal_targeting_pv,expand_targeting_click,normal_targeting_click,expand_targeting_conversion_cpc,expand_targeting_conversion_click,expand_targeting_conversion_ctr,normal_targeting_conversion_cpc,normal_targeting_conversion_click,normal_targeting_conversion_ctr,expand_targeting_cpc,normal_targeting_cpc,expand_targeting_ctr,normal_targeting_ctr,ocpm_comindex,expand_targeting_ocpm_comindex,normal_targeting_ocpm_comindex,ocpm_cpa,expand_targeting_ocpm_cpa,normal_targeting_ocpm_cpa,ocpm_cvr,expand_targeting_ocpm_cvr,normal_targeting_ocpm_cvr,expand_targeting_order_amount,normal_targeting_order_amount,phone_call_pv,phone_call_cost,valid_leads_cost,app_purchase_first_pv,app_purchase_first_cost,app_purchase_amount,minigame_register_uv,minigame_retention_uv,minigame_purchase_pv,minigame_purchase_amount";
//        String str = "spidb1f9d47d1b,wxb183054438df1471,2116118339,0211-免费-全-文2-图25-小Z1-女-T123-交1-4-内00-朋友圈,2116118341,0211-免费-全-文2-图25-小Z1-女-T123-交1-4-内00-朋友圈-卡4,210917560,PROMOTED_OBJECT_TYPE_LEAD_ADS_WECHAT,BUYING_TYPE_AUCTION,999,1581350400,1589126399,AD_STATUS_SUSPEND,OPTIMIZATIONGOAL_UNSUPPORTED,BID_ACTION_TYPE_UNSUPPORTED,80000000,20.00,2000,17.14,859,395,2.17,3,3,0.0035,5.71,3,0.0035,5.71,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0.0000,--,--,0,0,--,0,0,0,0,0,--,0.0000,0,0,--,0,--,0,--,0,--,0,0,0,0,0,0.00,--,0.00,0,0,0,--,0.0000,0,0,--,--,0.0000,0,0,--,--,0.0000,0,0,--,--,0.0000,0,0,0,0,0,0,0,2.11,15.03,119,740,0,3,0.70,0,0,5.01,3,0,--,5.01,0.0000,0.0041,0,0,0,--,--,--,0.0000,--,0.0000,0,0,0,--,--,0,--,0.00,0,0,0,0.00";
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println(Arrays.toString(str.split(",")));

        String imei = "";
    }
}
