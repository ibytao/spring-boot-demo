package com.example.demo;

import java.util.List;

import com.example.demo.bean.Employee;
import com.example.demo.mapper.EmployeeMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * EmployeeTest
 */
@SpringBootTest
public class EmployeeTest {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void getAllEmployees() {
        List<Employee> employees = employeeMapper.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Test
    void insertEmployees() {
        Employee employee = new Employee();
        employee.setEmail("joverm@gmail.com");
        employee.setLastName("joverm");
        employee.setGender("1");
        employeeMapper.insertEmployee(employee);
        System.out.println("插入id: " + employee.getId());
    }
}
