package Group_demo_hibernate.HibernateDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;


public class App 
{
   
	

	public static void main( String[] args )
    {
    	
    	
    	Configuration configuration=new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Student.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session=sessionFactory.openSession();

    	Student student1=new Student();
    	student1.setId(4);
    	student1.setName("efg");
    	student1.setEmail("d@a.com");
    	//System.out.println(student1.getName());
    	session.beginTransaction();
    	session.persist(student1);
    	session.getTransaction().commit();

    }
}
