package com.example.groupDemoJpaExcersize.repositories;

import com.example.groupDemoJpaExcersize.models.EmployeeProject;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeProjectRepo extends CrudRepository<EmployeeProject, Long> {
    EmployeeProject findById(long id);
}
