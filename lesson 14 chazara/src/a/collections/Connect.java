package a.collections;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db1?serverTimezone=Israel&createDatabaseIfNotExist=true";
		String user = "root"; // use your own user
		String password = "1234"; // use your own password

		try (Connection con = DriverManager.getConnection(url, user, password);) {
//		try (Connection con = DriverManager.getConnection(url);) {
			System.out.println("connected to: " + url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
