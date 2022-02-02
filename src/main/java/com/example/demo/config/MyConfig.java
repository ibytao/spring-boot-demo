package com.example.demo.config;

import com.example.demo.bean.Peat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = false)
@Import({ Peat.class })
public class MyConfig {
    @Bean
    public Peat peat() {
        return new Peat();
    }
}
