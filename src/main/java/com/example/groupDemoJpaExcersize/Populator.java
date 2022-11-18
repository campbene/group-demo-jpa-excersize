package com.example.groupDemoJpaExcersize;

import com.example.groupDemoJpaExcersize.models.*;
import com.example.groupDemoJpaExcersize.repositories.*;
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
    @Resource
    SupervisorRepo supervisorRepo;
    @Resource
    AddressRepo addressRepo;
    @Resource
    ContributorRepo contributorRepo;

    @Override
    public void run(String... args) throws Exception{
        Employee employeeOne = new Employee("Steve","Stan","Smith","Sr.");
        employeeRepo.save(employeeOne);
        Project projectOne = new Project("AlphaOne");
        projectRepo.save(projectOne);
        Address addressOne = new Address("1234 Bruce Rd.","","","Happy Township","OH","44111","44111-1234","Lorain","USA");
        addressRepo.save(addressOne);
        Supervisor supervisorOne = new Supervisor("Mr.", "Boss");
        supervisorRepo.save(supervisorOne);
        EmployeeProject employeeProjectOne = new EmployeeProject("Employee project one");
        employeeProjectRepo.save(employeeProjectOne);
        Contributor contributorOne = new Contributor("Contributor one");
        contributorRepo.save(contributorOne);
    }
}
