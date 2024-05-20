package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Employee;
import service.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Integer id = Integer.parseInt(request.getParameter("eid"));

		String name = request.getParameter("ename");

		String password = request.getParameter("epassword");

		String email = request.getParameter("email");

		Float salary = Float.parseFloat(request.getParameter("esalary"));

		Employee emp = new Employee(id, name, email, password, salary);

		EmployeeService es = new EmployeeService();

		try {
			boolean status = es.save(emp);

			if (status) {
				request.setAttribute("message", "Data insertion seccessful:" + id);
				RequestDispatcher rd = request.getRequestDispatcher("/RegisterSuccess.jsp");
				rd.forward(request, response);

			} else {
				request.setAttribute("message", "Data insertion not seccessful:" + id);
				RequestDispatcher rd = request.getRequestDispatcher("/RegisterFail.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
