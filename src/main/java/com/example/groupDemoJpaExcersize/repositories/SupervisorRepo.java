package com.example.groupDemoJpaExcersize.repositories;

import com.example.groupDemoJpaExcersize.models.Supervisor;
import org.springframework.data.repository.CrudRepository;

public interface SupervisorRepo extends CrudRepository<Supervisor, Long> {
    Supervisor findById(long id);
}
