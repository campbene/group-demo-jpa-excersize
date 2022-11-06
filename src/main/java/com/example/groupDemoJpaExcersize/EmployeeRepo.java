package com.example.groupDemoJpaExcersize;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    Employee findByEmployeeId(long employeeId);
    Employee findByLastName(String lastName);
}
