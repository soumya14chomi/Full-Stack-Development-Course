package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Laptop;
import beans.Student;

public class OneToOneMapping {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setStuName("Soumya");
		s1.setMarks(100);

		Laptop l1 = new Laptop();
		l1.setLid(10000);
		l1.setLname("HP");
		l1.setStudent(s1);
		s1.setLaptop(l1);

		s.persist(s1);
		t.commit();
		s.close();
		sf.close();

	}

}
