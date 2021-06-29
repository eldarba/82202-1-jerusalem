package app.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app.core.exceptions.PersonAppException;
import app.core.types.Person;

public class DataBaseUtil {

	public List<Person> getPersons() throws PersonAppException {
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

			return list;
			// ===============================================
		} catch (SQLException e) {
			throw new PersonAppException("getPersons failed", e);
		}

	}

}
