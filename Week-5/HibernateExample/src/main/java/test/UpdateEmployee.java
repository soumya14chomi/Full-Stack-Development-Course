package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		Employee employee = s.get(Employee.class, 101);
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Shruthi");

		s.merge(emp);

		t.commit();
		s.close();

		// t.close();
	}

}
