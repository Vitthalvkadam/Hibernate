package com.hibernateDemo.Fetching;

import com.hibernateDemo.OneToMany.LaptopClass;
import com.hibernateDemo.OneToMany.StudentClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Collection;

public class Main {
    public  static  void main(String[] args){

//        Student std = new Student();
//        std.setId(2);
//        std.setName("Pavan");


//        Laptop laptop = new Laptop();
//        laptop.setId(102);
//        laptop.setBrand("HP Victus");
//        laptop.setPrice(78000);
//
//
//        std.getLaptop().add(laptop);
//        laptop.setStudent(std);


        Configuration config = new Configuration().configure().
                addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();


        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        // Save
//        session.save(std);
//        session.save(laptop);

        Student student = session.get(Student.class, 1);


//        Lazy fetchnig by default
//        System.out.println(student.getName());

//        to fetch manually you can write ecode like this
//        Collection<Laptop> laptops = student.getLaptop();
//
//        for(Laptop l : laptops){
//            System.out.println(l);
//        }


//        Eager
        System.out.println(student.getName());

        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
