package c.writeTextToFile;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2ARM {

	public static void main(String[] args) {

		try (FileWriter out = new FileWriter("files/letter.txt");) {
			out.write("Hello Java IO");
			System.out.println("data written to file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
