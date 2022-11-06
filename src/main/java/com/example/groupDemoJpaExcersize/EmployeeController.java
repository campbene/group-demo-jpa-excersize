package com.example.groupDemoJpaExcersize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
