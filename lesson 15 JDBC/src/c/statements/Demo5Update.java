package c.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5Update {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected to " + url);
			// ===============================================
			// update all
			String sql = "update person set age = age+1";
			// update 106 only
//			String sql = "update person set age = age+1 where id = 106";

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
