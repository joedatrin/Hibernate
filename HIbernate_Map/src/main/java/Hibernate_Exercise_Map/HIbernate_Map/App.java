package Hibernate_Exercise_Map.HIbernate_Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        
     //Adding First Student Details
        Student student1=new Student();
        Address address=new Address();
        address.setAddress_id(14);
        address.setStreet("Thirty Six");
        student1.setId(3);
        student1.setName("abc");
        student1.setAddress(address);
     
       session.beginTransaction();
       session.save(student1);
       session.getTransaction().commit();
     //Adding Second Student Details
        address2.setAddress_id(201);
        address2.setStreet("2Thirty Six");
        student2.setId(205);
        student2.setName("2abc");
        student2.setAddress(address2);
        
        session.beginTransaction();
        session.save(student2);
        session.getTransaction().commit();
        
       //session.close();
    }
}
