package com.hibernateDemo.Fetching;

import com.hibernateDemo.Fetching.Laptop;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Alien")
public class Student {
    @Id
    private  int id;
    private  String name;

//    make fetch type eager to fetch related entity
    @OneToMany(mappedBy = "student" , fetch = FetchType.EAGER)
    private Collection<Laptop> laptops = new ArrayList<Laptop>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Laptop> getLaptop() {
        return laptops;
    }

    public void setLaptop(Collection<Laptop> laptop) {
        this.laptops = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
