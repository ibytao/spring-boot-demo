package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Car
 */
@Data
@Component
@ConfigurationProperties(prefix = "car")
public class Car {
    String brand;
    float price;
}
