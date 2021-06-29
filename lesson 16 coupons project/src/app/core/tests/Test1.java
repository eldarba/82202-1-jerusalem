package app.core.tests;

import java.util.List;

import javax.swing.JOptionPane;

import app.core.DataBaseUtil;
import app.core.types.Person;

public class Test1 {

	public static void main(String[] args) {
		try {
			DataBaseUtil util = new DataBaseUtil();
			List<Person> list = util.getPersons();
			System.out.println(list);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
			System.out.println("error: " + e.getMessage());
			System.out.println("cause: " + e.getCause());
			e.printStackTrace();

		}

	}

}
