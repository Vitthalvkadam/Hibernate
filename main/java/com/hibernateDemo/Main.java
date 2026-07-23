//    package com.hibernateDemo;
//
//    import com.hibernateDemo.Student;
//    import org.hibernate.Session;
//    import org.hibernate.SessionFactory;
//    import org.hibernate.Transaction;
//    import org.hibernate.cfg.Configuration;
//
//    import javax.imageio.spi.ServiceRegistry;
//
//    public class Main {
//
//        public static void main(String[] args) {
//
//
//
//            Name name = new Name();
//            name.setfNmae("Vitthal");
//            name.setmName("Vinayak");
//            name.setlNmae("Kadam");
//
//            Student a1 = new Student();
//            a1.setAid(103);
//            a1.setAname(name);
//            a1.setTech("React");
//
//            Configuration config = new Configuration();
//            config.addAnnotatedClass(com.hibernateDemo.Student.class);
//            config.configure("hibernate.cfg.xml");
//
//            SessionFactory factory = config.buildSessionFactory();
////            ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistery();
//
//            Session session = factory.openSession();
//
//            Transaction transaction = session.beginTransaction();
//
//            session.persist(a1);
//
//            transaction.commit();
//
//            session.close();
//            factory.close();
//        }
//    }