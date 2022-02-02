package com.example.demo.mapper;

import java.util.List;

import com.example.demo.bean.Employee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * EmployeeMapper
 */
// @Mapper
public interface EmployeeMapper {

    // @Select("select * from tbl_employee")
    List<Employee> getAllEmployees();

    Integer insertEmployee(Employee employee);
}
