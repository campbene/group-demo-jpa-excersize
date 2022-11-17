package com.example.groupDemoJpaExcersize.controllers;

import com.example.groupDemoJpaExcersize.models.Contributor;
import com.example.groupDemoJpaExcersize.repositories.ContributorRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ContributorController {

    @Resource
    ContributorRepo contributorRepo;

    @GetMapping("/Contributors")
    public Iterable<Contributor> getAllContributors(){
        return contributorRepo.findAll();
    }
}
