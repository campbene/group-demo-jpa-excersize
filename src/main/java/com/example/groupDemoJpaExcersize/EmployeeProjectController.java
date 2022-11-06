package com.example.groupDemoJpaExcersize;

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
