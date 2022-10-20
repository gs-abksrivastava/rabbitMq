package com.gainsight.rabbitmq.demo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SimpleMessage implements Serializable {
    private String name;
    private String description;
}
