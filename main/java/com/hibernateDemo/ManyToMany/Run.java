package com.hibernateDemo.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Run {
    public static void main(String[] args){


        Movie movie = new Movie();
        movie.setId(106);
        movie.setName("Bahubali");

        Actor actor = new Actor();
        actor.setId(1);
        actor.setFee(9800000);
        actor.setName("Prabhas");

        actor.getMovie().add(movie);
        movie.getActor().add(actor);

        Configuration config = new Configuration().configure().
                addAnnotatedClass(Actor.class).addAnnotatedClass(Movie.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
//            ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistery();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(movie);
        session.save(actor);

        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
