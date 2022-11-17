package com.example.groupDemoJpaExcersize.repositories;

import com.example.groupDemoJpaExcersize.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, Long> {
    Address findByAddressId(long projectId);
}
