package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import beans.Employee;

public class SelectMultipleRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

//		String hql = "From Employee  where id = 101";
//		Query q = s.createQuery(hql);
//
//		Employee emp = (Employee) q.uniqueResult();
//
//		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getEmail() + " " + emp.getSalary());

//		String hql1 = "Delete from Employee where id=101";
//		Query q1 = s.createQuery(hql1);
//		int i = q1.executeUpdate();

//		//Employee emp2 = (Employee) q.uniqueResult();
//		System.out.println(
//				"Delected:" + emp.getId() + " " + emp.getName() + " " + emp.getEmail() + " " + emp.getSalary());
//		System.out.println("");
		String hql2 = "update Employee set name = 'Soumya Namani', email = 'soumya14@gmail.com', Salary = 1000 where id =101";

		Query q2 = s.createQuery(hql2);

		int i1 = (int) q2.executeUpdate();

		System.out.println("Updated Record:" + i1);

		t.commit();
		sf.close();

	}

}
