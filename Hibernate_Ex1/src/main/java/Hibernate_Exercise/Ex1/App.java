

package Hibernate_Exercise.Ex1;



import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        configuration.addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Employee employee = new Employee();
        employee.setEmpId(2);
        employee.setEmpname("Grejoy");
        employee.setEmpSal(15000);
        employee.setEmpDept("Production");
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
        
        
    }
}
