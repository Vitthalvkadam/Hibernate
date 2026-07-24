package com.hibernateDemo.OneToMany;

//import com.hibernateDemo.Student;
  import org.hibernate.Session;
  import org.hibernate.SessionFactory;
  import org.hibernate.Transaction;
  import org.hibernate.cfg.Configuration;

public class MainClass {
    public static  void main(String[] args){

//      to set laptop details
        LaptopClass laptop = new LaptopClass();
        laptop.setId(106);
        laptop.setName("HP victus");

//       to set student details
        StudentClass user = new StudentClass();
        user.setMarks(98);
        user.setName("Dhiraj");
        user.setRollNo(5);
        user.getLaptop().add(laptop);

        Configuration config = new Configuration().configure().
            addAnnotatedClass(StudentClass.class).addAnnotatedClass(LaptopClass.class);
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
