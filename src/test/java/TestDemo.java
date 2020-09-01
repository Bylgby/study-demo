import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import java.net.URLEncoder;

/**
 * created date 2020/2/13 10:15
 *  删除重复节点
 * @author maxiaowei
 */
public class TestDemo {

    public static void main(String[] args) throws Exception{
        Long timestamp = System.currentTimeMillis();
        String secret = "SEC40070e33e41a1ad14321836eb5527e0a";
        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
        System.out.println(sign);
    }

}
