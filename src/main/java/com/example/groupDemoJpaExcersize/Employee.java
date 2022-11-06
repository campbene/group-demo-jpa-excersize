package com.example.groupDemoJpaExcersize;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @OneToMany
    @JoinColumn(name = "employee_Id", referencedColumnName = "Id")
    private List<EmployeeProject> employeeProjects;
//    @OneToOne(cascade = CascadeType.ALL)
//    private EmployeeProject employeeProject;

//    @OneToOne(mappedBy = "Employee")
//    private Supervisor supervisor;

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

    public List<EmployeeProject> getEmployeeProject(){
        return employeeProjects;
    }

}
