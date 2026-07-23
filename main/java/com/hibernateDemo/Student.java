package com.hibernateDemo;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    private int aid;
    @Embedded
    private Name aname;
    private String tech;

    // getters and setters


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public Name getAname() {
        return aname;
    }

    public void setAname(Name aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Student{" +
                "aid=" + aid +
                ", name='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}