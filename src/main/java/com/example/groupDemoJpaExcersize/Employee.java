package com.example.groupDemoJpaExcersize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String firstName, middleName, lastName, suffix;
    Address employeeAddress = new Address();
    Project employeeProject = new Project();

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
    public Address getEmployeeAddress(){
        return employeeAddress;
    }
    public Project getEmployeeProject(){
        return employeeProject;
    }

}
