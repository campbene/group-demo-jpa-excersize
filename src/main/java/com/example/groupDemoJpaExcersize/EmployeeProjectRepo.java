package com.example.groupDemoJpaExcersize;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeProjectRepo extends CrudRepository<EmployeeProject, Long> {
    EmployeeProject findById(long id);
}
