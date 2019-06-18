package com.neo.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
// 标示监听队列 topic.message
@RabbitListener(queues = "topic.message")
public class TopicReceiver {

    @RabbitHandler
    public void process(String message) {
        //定义接收消息处理逻辑
        System.out.println("Topic Receiver1  : " + message);
    }

}
