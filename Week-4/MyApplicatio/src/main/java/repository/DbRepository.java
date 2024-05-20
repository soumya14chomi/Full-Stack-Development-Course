package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbRepository {

	private static Connection conn;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String db = "cogentunivl";

		String url = "jdbc:mysql://localhost:3306/" + db;

		conn = DriverManager.getConnection(url, "root", "1037");

		return conn;

	}

	public static void closeConnection() throws SQLException {

		if (conn != null) {
			conn.close();
		}

	}

}
