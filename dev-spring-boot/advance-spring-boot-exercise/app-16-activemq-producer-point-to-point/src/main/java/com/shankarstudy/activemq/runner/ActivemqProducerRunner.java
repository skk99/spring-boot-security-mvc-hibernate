package com.shankarstudy.activemq.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ActivemqProducerRunner implements CommandLineRunner {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${queuename}")
    private String destinationName;

    @Override
    public void run(String... args) throws Exception {
        MessageCreator messageCreator = session ->
                session.createTextMessage("From Producer: " + LocalDateTime.now());

        jmsTemplate.send(destinationName, messageCreator);
    }
}
