package com.example.groupDemoJpaExcersize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;

    private String projectName;

    protected Project(){}
    public Project(String projectName){
        this.projectName = projectName;
    }

    public Long getProjectId(){
        return projectId;
    }
    public String getProjectName(){
        return projectName;
    }
}
