package com.example.rabbitms.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class HelloSend {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "" + new Date();
        System.out.println("send:" + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
