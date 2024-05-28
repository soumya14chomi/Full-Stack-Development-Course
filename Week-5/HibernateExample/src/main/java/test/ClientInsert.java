package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Employee;

import org.hibernate.Transaction;

public class ClientInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();

		System.out.println("Hello");

		cfg.configure("resources/mysql.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		Employee e = new Employee(101, "Soumya", "Soumya@gmail.com", 12);
		s.save(e);

		t.commit();
		s.close();
		sf.close();
		System.out.println("Data Inserted");

	}

}
