package f.objects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1ObjectToFile {

	public static void main(String[] args) {

		Person p = new Person(101, "Avi", 27);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("files/personObj"))) {

			out.writeObject(p);
			System.out.println(p);
			System.out.println("written to file - serialized");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
