package com.example.groupDemoJpaExcersize.controllers;

import com.example.groupDemoJpaExcersize.models.Employee;
import com.example.groupDemoJpaExcersize.repositories.EmployeeRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmployeeController {
    @Resource
    EmployeeRepo employeeRepo;

    @GetMapping("/Employee")
    public Iterable<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }
}
