package com.hibernateDemo.ManyToMany;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Id
    private  int id;
    private String name;

    @ManyToMany
    private List<Actor> actors = new ArrayList<Actor>();


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

    public List<Actor> getActor() {
        return actors;
    }

    public void setActor(List<Actor> actor) {
        this.actors = actor;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", actor=" + actors +
                '}';
    }
}
