package com.example.groupDemoJpaExcersize.controllers;

import com.example.groupDemoJpaExcersize.models.Supervisor;
import com.example.groupDemoJpaExcersize.repositories.SupervisorRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SupervisorController {

    @Resource
    SupervisorRepo supervisorRepo;

    @GetMapping("/Supervisor")
    public Iterable<Supervisor> getAllSupervisors(){
        return supervisorRepo.findAll();
    }
}
