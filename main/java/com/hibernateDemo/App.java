package com.hibernateDemo;

//import com.hibernateDemo.Student;
  import org.hibernate.Session;
  import org.hibernate.SessionFactory;
  import org.hibernate.Transaction;
  import org.hibernate.cfg.Configuration;

public class App {
    public static  void main(String[] args){


        Laptop laptop = new Laptop();
        laptop.setId(102);
        laptop.setName("MSI");

        User user = new User();
        user.setMarks(89);
        user.setName("Aryan");
        user.setRollNo(2);

        Configuration config = new Configuration().configure().
            addAnnotatedClass(com.hibernateDemo.User.class).addAnnotatedClass(Laptop.class);
            config.configure("hibernate.cfg.xml");

            SessionFactory factory = config.buildSessionFactory();
//            ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistery();

            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            session.persist(user);
            session.save(laptop);

            session.getTransaction().commit();

            session.close();
            factory.close();
    }
}
