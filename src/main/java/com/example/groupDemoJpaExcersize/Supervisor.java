package com.example.groupDemoJpaExcersize;

import javax.persistence.*;

@Entity
public class Supervisor {
    @Id
    @GeneratedValue
    private Long id;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name ="employee_id", referencedColumnName = "employeeId")
//    private Employee employee;
}
