package com.example.groupDemoJpaExcersize.repositories;

import com.example.groupDemoJpaExcersize.models.Contributor;
import com.example.groupDemoJpaExcersize.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface ContributorRepo extends CrudRepository<Contributor, Long> {
    Contributor findById(long id);
    //Contributor findByEmployee(Employee employee);
}
