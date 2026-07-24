package com.hibernateDemo.OneToOne;

//import com.hibernateDemo.Student;
  import org.hibernate.Session;
  import org.hibernate.SessionFactory;
  import org.hibernate.Transaction;
  import org.hibernate.cfg.Configuration;

public class App {
    public static  void main(String[] args){


        Laptop laptop = new Laptop();
        laptop.setId(103);
        laptop.setName("Acer Nitro");

        User user = new User();
        user.setMarks(88);
        user.setName("Yash");
        user.setRollNo(3);

        Configuration config = new Configuration().configure().
            addAnnotatedClass(User.class).addAnnotatedClass(Laptop.class);
            config.configure("hibernate.cfg.xml");

            SessionFactory factory = config.buildSessionFactory();


            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            session.persist(user);
            session.save(laptop);

            session.getTransaction().commit();

            session.close();
            factory.close();
    }
}
