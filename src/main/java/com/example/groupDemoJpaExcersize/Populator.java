package com.example.groupDemoJpaExcersize;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    EmployeeRepo employeeRepo;
    @Resource
    ProjectRepo projectRepo;
    @Resource
    EmployeeProjectRepo employeeProjectRepo;

    @Override
    public void run(String... args) throws Exception{
        Employee employeeOne = new Employee("Steve","Stan","Smith","Sr.");
        employeeRepo.save(employeeOne);
        Project projectOne = new Project("AlphaOne");
        projectRepo.save(projectOne);
        EmployeeProject employeeProjectOne = new EmployeeProject();
        employeeProjectRepo.save(employeeProjectOne);
    }
}
