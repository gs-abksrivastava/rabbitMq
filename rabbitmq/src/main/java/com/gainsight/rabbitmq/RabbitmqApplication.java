package com.gainsight.rabbitmq;

import com.gainsight.rabbitmq.demo.SimpleMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqApplication implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleMessage simpleMessage = new SimpleMessage();
        simpleMessage.setName("First Message");
        simpleMessage.setDescription("Simple Description");
        rabbitTemplate.convertAndSend("MyTopicExchange","topic",simpleMessage);
    }
}
