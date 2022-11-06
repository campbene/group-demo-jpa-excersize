package com.example.groupDemoJpaExcersize;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Project, Long> {
    Project findByProjectId(long projectId);
}
