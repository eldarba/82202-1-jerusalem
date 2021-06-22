package f.objects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2ObjectFromFile {

	public static void main(String[] args) {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("files/personObj"))) {

			Person p = (Person) in.readObject();
			System.out.println(p);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
