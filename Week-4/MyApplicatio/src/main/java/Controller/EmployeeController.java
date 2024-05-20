package Controller;

import java.sql.SQLException;
import java.util.List;

import Model.Employee;
import repository.DbRepository;
import service.EmployeeService;

public class EmployeeController {

	EmployeeService es;

	public EmployeeController() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		EmployeeController eController = new EmployeeController();

		// eController.printData();

		eController.addData();

		// System.out.println("\nAfter Insertion:\n");

		// eController.printData();

		// eController.printById(105);

		// eController.deleteById(105);

		// eController.update();

		eController.closeconn();

	}

//	public void printData() throws SQLException {
//
//		es = new EmployeeService();
//
//		List<Employee> elist = es.fetchAll();
//
//		System.out.println(elist);
//	}

	public void addData() throws SQLException {

		es = new EmployeeService();

		Boolean status = es.save(new Employee(105, "Soumya", "sodj@gmail.com", "password", 23893f));

		if (status)
			System.out.println("Operation Success");

		else {
			System.out.println("Operation not success");
		}

	}

//	public void printById(int id) throws SQLException {
//
//		es = new EmployeeService();
//
//		Employee employee = es.fetchByID(105);
//
//		if (employee == null)
//			System.out.println("No Employee Found by Id:" + id);
//
//		else
//			System.out.println("Employee found:" + employee);
//
//	}
//
//	public void deleteById(int id) throws SQLException {
//
//		es = new EmployeeService();
//
//		boolean status = es.deleteById(105);
//
//		if (!status)
//			System.out.println("No Employee Found by Id:" + id);
//
//		else
//			System.out.println("Delete Successful of " + id);
//
//	}
//
//	public void update() throws SQLException {
//
//		es = new EmployeeService();
//
//		int oldId = 105;
//
//		Employee employee = new Employee(104, "Soumya", "sjdh@gmail.com", "password", 2398f);
//
//		boolean status = es.updateById(oldId, employee);
//
//		if (!status)
//			System.out.println("Update Not Success from " + oldId + " to " + employee.getId());
//
//		else
//			System.out.println("Update Successful from " + oldId + " to " + employee.getId());
//	}

	public void closeconn() throws SQLException {

		DbRepository.closeConnection();
	}

}
