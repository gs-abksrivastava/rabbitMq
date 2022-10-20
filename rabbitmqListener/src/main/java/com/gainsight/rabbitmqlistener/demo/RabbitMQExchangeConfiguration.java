package com.gainsight.rabbitmqlistener.demo;


import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {

    @Bean
    Exchange exampleExcahnge(){
        return new TopicExchange("ExampleExchange");
    }

    @Bean
    Exchange example2Exchange(){
        return ExchangeBuilder.directExchange("Example2Exchange")
                .autoDelete()
                .internal()
                .build();
    }

    @Bean
    Exchange newExchange(){
        return ExchangeBuilder.topicExchange("TopicTestExcahnge")
                .internal()
                .autoDelete()
                .durable(true)
                .build();
    }

    @Bean
    Exchange fanoutExchange(){
        return ExchangeBuilder.fanoutExchange("FanoutTestExchange")
                .autoDelete()
                .internal()
                .durable(true)
                .build();
    }

    @Bean
    Exchange headersExchange(){
         return ExchangeBuilder.headersExchange("HeaderTestExchange")
                 .internal()
                 .durable(true)
                 .ignoreDeclarationExceptions()
                 .build();
    }
}
