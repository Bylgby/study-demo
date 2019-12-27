package com.martinyuyy.rocketMQ;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * 服务提供者
 *
 * 同步发送消息，一般是 等待上一条消息返回结果之后，再发送下一条
 * <br>
 * created date 2019/12/26 17:47
 *
 * @author maxiaowei
 */

public class SyncProducer {

    public static void main(String[] args) throws Exception {

        // 实例化一个带分组名称的服务提供者
        DefaultMQProducer producer = new
                DefaultMQProducer("martinyuyy");
        // 设置name server的地址
        producer.setNamesrvAddr("106.13.53.40:9876");
        // 启动producer
        producer.start();

        for (int i = 0; i < 100; i++) {
            // 创建一个消息实例， 并设置 topic， tag， 消息内容
            Message message = new Message("TopicTest",
                    "TagA",
                    ("Hello RocketMQ" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult result = producer.send(message);
            System.out.printf("%s%n", result);
        }
        // 关闭
        producer.shutdown();
    }
}
