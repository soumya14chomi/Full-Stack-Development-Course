package JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTestExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		String db = "cogentunivl";
		
		String url = "jdbc:mysql://localhost:3306/"+db;
		
		Connection conn = DriverManager.getConnection(url,"root", "1037");
		
		PreparedStatement ps = conn.prepareStatement("select *from employee");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			Float salary = rs.getFloat(4);
			System.out.println(id+" "+name+" "+salary+" "+email);
		}
		
		conn.close();
	}
}
