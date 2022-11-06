package com.example.groupDemoJpaExcersize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeProject {
    @Id
    @GeneratedValue
    private Long id;
    private Long employeeId, projectId;

    public EmployeeProject(){}

    public EmployeeProject(long employeeId, long projectId){
        this.employeeId = employeeId;
        this.projectId = projectId;
    }
    public long getId(){
        return id;
    }
}
