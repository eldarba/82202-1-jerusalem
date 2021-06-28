package c.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import types.Person;

public class Demo9SelectToCollection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			// ===============================================
			String sql = "select * from person";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			List<Person> list = new ArrayList<Person>();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Person person = new Person(id, name, age);
				list.add(person);
			}

			System.out.println(list);
			System.out.println(sql);
			// ===============================================
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
