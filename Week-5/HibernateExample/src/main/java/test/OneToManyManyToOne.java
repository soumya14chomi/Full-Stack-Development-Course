package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.onetomany.StudentAddress;
import beans.onetomany.StudentData;

public class OneToManyManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		StudentAddress a1 = new StudentAddress();
		a1.setAddress_details("India");

		StudentData student = new StudentData();
		student.setStudent_name("Soumya");
		student.setStudent_address(a1);

		StudentData student1 = new StudentData();
		student1.setStudent_name("Shruthi");
		student1.setStudent_address(a1);

		Set<StudentData> set = new HashSet<StudentData>();
		set.add(student);
		set.add(student1);

		a1.setStudents(set);

		s.save(a1);
		t.commit();
		s.close();
		sf.close();

	}

}
