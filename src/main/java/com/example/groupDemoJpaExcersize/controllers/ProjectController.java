package com.example.groupDemoJpaExcersize.controllers;

import com.example.groupDemoJpaExcersize.models.Project;
import com.example.groupDemoJpaExcersize.repositories.ProjectRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProjectController {
    @Resource
    ProjectRepo projectRepo;
    @GetMapping("/Projects")
    public Iterable<Project> getAllProjects(){
        return projectRepo.findAll();
    }
}
