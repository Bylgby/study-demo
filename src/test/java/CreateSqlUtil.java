/**
 * created date 2020/8/21 10:22
 * <p>
 *
 * @author martinyuyy
 */
public class CreateSqlUtil {

    public static void main(String[] args) {
        String sql = "media_flag string comment '媒体标识',\n" +
                "creative_id string comment '创意ID',\n" +
                "title string comment '标题',\n" +
                "video_id string comment '视频ID',\n" +
                "video_url string comment '视频URL',\n" +
                "image_id string comment '图片ID',\n" +
                "image_url_list string comment '图片URL',\n" +
                "creative_id_status string comment '创意状态',\n" +
                "image_mode string comment '素材类型',\n" +
                "inventory_type string comment '投放位置',\n" +
                "ad_id string comment '所属广告ID',\n" +
                "ad_name string comment '广告名称',\n" +
                "adgroup_id string comment '所属广告组ID',\n" +
                "adgroup_name string comment '广告组名称',\n" +
                "external_url string comment 'API URL',\n" +
                "source_id string comment '热点ID',\n" +
                "account_id string comment '所属账户ID',\n" +
                "site_id string comment '账号id',\n" +
                "site_name string comment '账号名称',\n" +
                "platform_id string comment '所属平台ID',\n" +
                "platform_name string comment '平台名称',\n" +
                "url string comment '营销系统中对应的热点url',\n" +
                "monitor_type string comment '监控类型',\n" +
                "monitor_subject string comment '投放科目',\n" +
                "main_id string comment '管家账号ID',\n" +
                "department_id string comment '部门id',\n" +
                "department_name string comment '部门名称'";
        String tableName = "wx_dwsdb.dws_mkt_ad_creative_details";
        String[] arr = sql.split("\n");
        StringBuilder sb = new StringBuilder("select distinct");
        for (String s : arr) {
            sb.append(" ").append(s.substring(0,s.indexOf(" "))).append(",");
        }
        sb.append(" ").append("from ").append(tableName).append(" where dt < 20200821");
        System.out.println(sb.toString());
    }
}
