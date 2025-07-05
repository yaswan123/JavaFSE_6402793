package com.hibernate.hibernate;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import com.hibernate.model.Employee;
@SpringBootApplication
@EntityScan(basePackages = "com.hibernate.model")
public class HibernateApplication {
	private static SessionFactory sessionFactory;
	public static void buildSession() {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Long saveEmployeeByHibernate(Employee e) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Long empId = null;
		try {
			tx = session.beginTransaction();
			session.persist(e);      
	        tx.commit();
	        empId = e.getId();
		}
		catch(Exception ex) {
	         if (tx != null) tx.rollback();
	         ex.printStackTrace();
		}
		finally {
			session.close();
		}
		return empId;
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HibernateApplication.class, args);
		buildSession();
	    Employee emp = new Employee("yash", 20000);
	    Long empId = saveEmployeeByHibernate(emp);
		System.out.println("Employee Name: " + emp.getName());
		System.out.println(empId);
	}

}
