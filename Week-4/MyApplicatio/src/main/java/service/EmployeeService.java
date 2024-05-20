package service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Employee;
import repository.DbRepository;

public class EmployeeService {

//	public List<Employee> fetchAll() throws SQLException {
//
//		Connection conn = DbRepository.getConnection();
//
//		PreparedStatement ps = conn.prepareStatement("select *from employee");
//
//		ResultSet rs = ps.executeQuery();
//
//		List<Employee> list = new ArrayList<>();
//
//		while (rs.next()) {
//
//			Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
//					rs.getFloat(5));
//
//			list.add(emp);
//		}
//
//		return list;
//
//	}

	public Boolean save(Employee e) throws SQLException, ClassNotFoundException {

		Connection connection = DbRepository.getConnection();

		PreparedStatement ps = connection.prepareStatement("insert into Emp values (?,?,?,?,?)");

		ps.setInt(1, e.getId());

		ps.setString(2, e.getName());

		ps.setString(3, e.getEmail());

		ps.setString(4, e.getPassword());

		ps.setFloat(5, e.getSalary());

		int x = ps.executeUpdate();

		if (x > 0) {
			return true;
		}

		return false;

	}

//	public Employee fetchByID(int id) throws SQLException {
//
//		Connection connection = DbRepository.getConnection();
//
//		PreparedStatement ps = connection.prepareStatement("select *from employee where id = ?");
//
//		ps.setInt(1, id);
//
//		ResultSet rSet = ps.executeQuery();
//
//		if (rSet.next()) {
//
//			Employee employee = new Employee(rSet.getInt(1), rSet.getString(2), rSet.getString(3), rSet.getFloat(4));
//
//			return employee;
//		}
//
//		return null;
//
//	}
//
//	public boolean deleteById(int id) throws SQLException {
//
//		Connection connection = DbRepository.getConnection();
//
//		PreparedStatement ps = connection.prepareStatement("delete from employee where id = ?");
//
//		ps.setInt(1, id);
//
//		int x = ps.executeUpdate();
//
//		if (x > 0)
//			return true;
//
//		return false;
//
//	}
//
//	public boolean updateById(int id, Employee emp) throws SQLException {
//
//		Connection connection = DbRepository.getConnection();
//
//		PreparedStatement ps = connection
//				.prepareStatement("update employee set id = ?, name = ?, email =?, salary =? where id = ?");
//
//		ps.setInt(1, emp.getId());
//
//		ps.setString(2, emp.getName());
//
//		ps.setString(3, emp.getEmail());
//
//		ps.setFloat(4, emp.getSalary());
//
//		ps.setInt(5, id);
//
//		int x = ps.executeUpdate();
//
//		if (x > 0)
//			return true;
//
//		return false;
//
//	}

}
