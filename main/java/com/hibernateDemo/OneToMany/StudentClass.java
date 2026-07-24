package com.hibernateDemo.OneToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class StudentClass {
    @Id
    private  int rollNo;
    private  String name;
    private  float marks;

//    one to many
    @OneToMany(mappedBy = "student")
    private List<LaptopClass> laptop = new ArrayList<LaptopClass>();

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public List<LaptopClass> getLaptop() {
        return laptop;
    }

    public void setLaptop(ArrayList<LaptopClass> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "User{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", laptop=" + laptop +
                '}';
    }
}
