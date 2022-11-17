package com.example.groupDemoJpaExcersize.controllers;

import com.example.groupDemoJpaExcersize.models.Address;
import com.example.groupDemoJpaExcersize.repositories.AddressRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AddressController {
    @Resource
    AddressRepo addressRepo;
    @GetMapping("/Address")
    public Iterable<Address> getAllAddresses(){
        return addressRepo.findAll();
    }
}
