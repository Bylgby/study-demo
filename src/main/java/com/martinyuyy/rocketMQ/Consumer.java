package com.martinyuyy.rocketMQ;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListener;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.List;

/**
 * 消费者
 * <br>
 * created date 2019/12/26 17:58
 *
 * @author maxiaowei
 */

public class Consumer {

    public static void main(String[] args) throws Exception {

        DefaultMQPushConsumer consumer = new
                DefaultMQPushConsumer("martinyuyy");

        System.out.println("Consumer instance.");

        consumer.setNamesrvAddr("106.13.53.40:9876");
        // 订阅一个Topic， 去消费
        consumer.subscribe("TopicTest", "*");
        consumer.setConsumeThreadMin(20);
        consumer.setConsumeThreadMax(20);

        // 从broker中获取消息，并消费
        consumer.registerMessageListener(new MessageListenerConcurrently() {

            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list,
                                                            ConsumeConcurrentlyContext consumeConcurrentlyContext) {

                System.out.printf("%s Receive New Message: %s %n", Thread.currentThread().getName(), list);

                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();

        System.out.printf("Consumer Started.%n");
    }
}
