package com.example.demo.bean;

import lombok.Data;
import lombok.ToString;

/**
 * Employee
 */
@ToString
@Data
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
}
