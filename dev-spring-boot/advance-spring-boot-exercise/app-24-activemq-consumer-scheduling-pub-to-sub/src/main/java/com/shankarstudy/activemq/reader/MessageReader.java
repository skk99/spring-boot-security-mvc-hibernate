package com.shankarstudy.activemq.reader;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReader {
    @JmsListener(destination = "${topicname}")
    public void readMessage(String message) {
        System.out.printf("Message in Consumer is: " + message);
    }
}
