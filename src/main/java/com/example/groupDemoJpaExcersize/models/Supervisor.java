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
    private String firstName, lastName;

    public Supervisor(){}

    public Supervisor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
