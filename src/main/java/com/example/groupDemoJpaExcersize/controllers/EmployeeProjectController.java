package com.example.groupDemoJpaExcersize.controllers;

import com.example.groupDemoJpaExcersize.models.EmployeeProject;
import com.example.groupDemoJpaExcersize.repositories.EmployeeProjectRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmployeeProjectController {
    @Resource
    EmployeeProjectRepo employeeProjectRepo;

    @GetMapping("/EmployeeProjects")
    public Iterable<EmployeeProject> getAllEmployeeProjects(){
        return employeeProjectRepo.findAll();
    }
}
