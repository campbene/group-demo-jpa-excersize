package com.example.groupDemoJpaExcersize.models;

import javax.persistence.*;

@Entity
@Table(name = "employeeProject")
public class EmployeeProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Employee employeeId;

    @ManyToOne
    private Project projectId;

    private String employeeProjectName;

    public EmployeeProject(){}

    public EmployeeProject(String employeeProjectName){
        this.employeeProjectName = employeeProjectName;
    }

    public Long getId(){
        return id;
    }
    public Employee getEmployee(){
        return employeeId;
    }
    public Project getProjectId(){
        return projectId;
    }
    public String getEmployeeProjectName(){
        return employeeProjectName;
    }
}
