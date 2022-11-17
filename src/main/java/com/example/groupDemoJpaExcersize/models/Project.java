package com.example.groupDemoJpaExcersize.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private Collection<EmployeeProject> employeeProjects;

    @ManyToOne
    private Supervisor supervisor;

    @OneToMany
    private Collection<Contributor> contributors;

    private String projectName;

    protected Project(){}
    public Project(String projectName){
        this.projectName = projectName;
    }

    public Long getProjectId(){
        return id;
    }
    public String getProjectName(){
        return projectName;
    }
    public Collection<EmployeeProject> getEmployeeProjects(){
        return employeeProjects;
    }
    public Supervisor getSupervisor(){
        return supervisor;
    }
    public Collection<Contributor> getContributors(){
        return contributors;
    }
}
