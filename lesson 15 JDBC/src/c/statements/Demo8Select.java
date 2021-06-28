package c.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo8Select {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			// ===============================================
			String sql = "select * from person";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
//				int id = rs.getInt(1); // specify column index (start at 1)
//				String name = rs.getString(2);
//				int age = rs.getInt(3);
				int id = rs.getInt("id"); // specify column name
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);
			}

			System.out.println(sql);
			// ===============================================
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
