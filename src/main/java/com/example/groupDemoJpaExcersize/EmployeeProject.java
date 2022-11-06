package com.example.groupDemoJpaExcersize;

import javax.persistence.*;

@Entity
@Table(name = "employeeProject")
public class EmployeeProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Employee employeeId;

    public EmployeeProject(){}

//    public EmployeeProject(long employeeId, long projectId){
//        this.employeeId = employeeId;
//        this.projectId = projectId;
//    }

    public long getId(){
        return id;
    }
    public Employee getEmployee(){
        return employeeId;
    }
}
