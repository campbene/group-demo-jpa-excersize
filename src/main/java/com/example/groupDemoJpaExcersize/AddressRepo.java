package com.example.groupDemoJpaExcersize;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, Long> {
    Address findByAddressId(long projectId);
}
