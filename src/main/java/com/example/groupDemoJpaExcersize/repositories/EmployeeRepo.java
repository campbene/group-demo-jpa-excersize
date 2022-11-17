package com.example.groupDemoJpaExcersize.repositories;

import com.example.groupDemoJpaExcersize.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    Employee findByEmployeeId(long employeeId);
    Employee findByLastName(String lastName);
}
