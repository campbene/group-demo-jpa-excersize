package com.example.groupDemoJpaExcersize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AddressController {
    @Resource
    AddressRepo addressRepo;
    @GetMapping
    public Iterable<Address> getAllAddresses(){
        return addressRepo.findAll();
    }
}
