package com.example.demo;

import com.example.demo.bean.Peat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

        // String[] names = run.getBeanDefinitionNames();
        // for (String name : names) {
        // System.out.println(name);
        // }

        // System.out.println("======================");
        // String[] beanNames = run.getBeanNamesForType(Peat.class);
        // for (String beanName : beanNames) {
        // System.out.println(beanName);
        // }
    }
}
