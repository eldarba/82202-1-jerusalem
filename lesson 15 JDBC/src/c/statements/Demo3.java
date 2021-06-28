package c.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected to " + url);
			// ===============================================
			String[] names = { "Dan", "Lea", "Yoni", "David", "Moshe", "Yosi" };
			for (int id = 102; id <= 200; id++) {
				int age = (int) (Math.random() * 121);
				String name = names[(int) (Math.random() * names.length)];
				String sql = "insert into person values(" + id + ", '" + name + "', " + age + ");";
				// use Statement to send SQL commands to the RDBMS
				// we get the Statement object from the Connection
				Statement stmt = con.createStatement();
				stmt.executeUpdate(sql);
				System.out.println(sql);
			}
			// ===============================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + url);

	}

}
