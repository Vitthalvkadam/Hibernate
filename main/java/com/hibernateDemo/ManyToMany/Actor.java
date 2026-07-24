package com.hibernateDemo.ManyToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Actor {
    @Id
    private int id;
    private  String name;
    private  double fee;

//    many to many
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies = new ArrayList<Movie>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public List<Movie> getMovie() {
        return movies;
    }

    public void setMovie(List<Movie> movie) {
        this.movies = movie;
    }

    @Override
    public String toString() {
        return "Actor{" +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                ", movie=" + movies +
                '}';
    }
}
