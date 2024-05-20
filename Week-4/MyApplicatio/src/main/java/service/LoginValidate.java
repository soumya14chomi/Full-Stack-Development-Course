package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import repository.DbRepository;

public class LoginValidate {

	public LoginValidate() {
		// TODO Auto-generated constructor stub

	}

	public boolean checkLogin(Integer id, String password) throws SQLException, ClassNotFoundException {

		Connection conn = DbRepository.getConnection();

		PreparedStatement ps = conn.prepareStatement("select *from emp where id =? and password=?");

		ps.setInt(1, id);

		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			return true;
		}
		return false;

	}

}
