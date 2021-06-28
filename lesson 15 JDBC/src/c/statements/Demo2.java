package c.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected to " + url);
			// ===============================================
			String sql = "insert into person values(101, 'Mark', 26);";
			// use Statement to send SQL commands to the RDBMS
			// we get the Statement object from the Connection
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
			// ===============================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);

	}

}
