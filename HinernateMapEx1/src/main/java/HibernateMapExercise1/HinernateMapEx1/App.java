package HibernateMapExercise1.HinernateMapEx1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     Configuration configuration = new Configuration();
     configuration.configure("hibernate.cfg.xml");
     configuration.addAnnotatedClass(Student1.class);
     SessionFactory sessionFactory = configuration.buildSessionFactory();
     Session session = sessionFactory.openSession();
     
     Student1 student = new Student1();
     Address1 address = new Address1();
     
     address.setDoorNo(1);
     address.setStreet("512Abc");
     student.setRollNo(001);
     student.setMarksScored(99);
     student.setAddress(address);
     
     session.beginTransaction();
     session.save(student);
     session.getTransaction().commit();
    }
}
