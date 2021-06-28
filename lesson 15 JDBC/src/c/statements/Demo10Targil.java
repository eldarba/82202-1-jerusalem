package c.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import types.Person;

public class Demo10Targil {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		String[] names = { "aaa", "bbb", "ccc" };
		for (int id = 201; id <= 230; id++) {
			String name = names[(int) (Math.random() * names.length)];
			int age = (int) (Math.random() * 121);
			Person p = new Person(id, name, age);
			list.add(p);
		}

		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			// ===============================================
			String sql;
			Statement stmt = con.createStatement();
			for (Person p : list) {
				sql = "insert into person values(" + p.getId() + ", '" + p.getName() + "', " + p.getAge() + ")";
				stmt.executeUpdate(sql);
				System.out.println(sql);
			}
			// ===============================================
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
