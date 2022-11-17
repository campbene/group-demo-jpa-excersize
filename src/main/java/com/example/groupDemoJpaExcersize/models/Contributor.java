package com.example.groupDemoJpaExcersize.models;

import javax.persistence.*;

@Entity
public class Contributor {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Employee employee;

    @OneToOne
    private Supervisor supervisor;

    @ManyToOne
    private Project project;

    public Contributor(){}

    public Long getId(){
        return id;
    }
    public Employee getEmployee(){
        return employee;
    }
    public Supervisor getSupervisor(){
        return supervisor;
    }
    public Project getProject(){
        return project;
    }
}
