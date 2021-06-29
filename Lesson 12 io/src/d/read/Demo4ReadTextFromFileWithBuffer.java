package d.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo4ReadTextFromFileWithBuffer {

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader(new FileReader("files/letter.txt"));) {
			String line = in.readLine(); // read the first line
			while (line != null) {
				System.out.println(line); // print current line
				line = in.readLine(); // read the next line
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
