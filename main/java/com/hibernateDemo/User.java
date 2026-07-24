//package com.hibernateDemo;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    private  int rollNo;
//    private  String name;
//    private  float marks;
//    @OneToOne
//    private Laptop laptop;
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getMarks() {
//        return marks;
//    }
//
//    public void setMarks(float marks) {
//        this.marks = marks;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "rollNo=" + rollNo +
//                ", name='" + name + '\'' +
//                ", marks=" + marks +
//                ", laptop=" + laptop +
//                '}';
//    }
//}
