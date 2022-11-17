package com.example.groupDemoJpaExcersize.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @OneToMany
    private Collection<EmployeeProject> employeeProjects;

    @ManyToOne
    private Supervisor supervisor;

    @OneToOne
    private Address address;

    @OneToOne
    private Contributor contributor;

    private String firstName, middleName, lastName, suffix;

    protected Employee(){}

    public Employee(String firstName, String middleName, String lastName, String suffix){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Long getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSuffix(){
        return suffix;
    }

    public Collection<EmployeeProject> getEmployeeProject(){
        return employeeProjects;
    }
    public Supervisor getSupervisor(){
        return supervisor;
    }
    public Address getAddress(){
        return address;
    }
    public Contributor getContributor(){
        return contributor;
    }

}
