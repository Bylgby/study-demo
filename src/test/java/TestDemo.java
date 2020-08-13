import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * created date 2020/2/13 10:15
 *  删除重复节点
 * @author maxiaowei
 */
public class TestDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList);



    }

}
