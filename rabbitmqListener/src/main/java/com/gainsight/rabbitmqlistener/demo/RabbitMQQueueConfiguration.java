package com.gainsight.rabbitmqlistener.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitMQQueueConfiguration {
    @Bean
    Queue exampleQueue(){
        return new Queue("Example Queue",false);
    }

    @Bean
    Queue example3Queue(){
        return QueueBuilder.durable("Example3Queue")
                .autoDelete()
                .build();
    }
}
