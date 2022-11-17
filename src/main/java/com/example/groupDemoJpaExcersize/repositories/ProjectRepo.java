package com.example.groupDemoJpaExcersize.repositories;

import com.example.groupDemoJpaExcersize.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Project, Long> {
    Project findById(long id);
}
