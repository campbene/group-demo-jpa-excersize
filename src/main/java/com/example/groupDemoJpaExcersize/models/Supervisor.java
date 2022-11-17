package com.example.groupDemoJpaExcersize.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Supervisor {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Collection<Employee> employees;

    @OneToMany
    private Collection<Project> projects;

    @OneToOne
    private Contributor contributor;

    public Supervisor(){}

    public Long getId(){
        return id;
    }
    public Collection<Employee> getEmployees(){
        return employees;
    }
    public Collection<Project> getProjects(){
        return projects;
    }
    public Contributor getContributor(){
        return contributor;
    }
}
