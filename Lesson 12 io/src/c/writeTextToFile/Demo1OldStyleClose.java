package c.writeTextToFile;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1OldStyleClose {

	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("files/letter.txt");
			out.write("Hello Java IO");
			System.out.println("data written to file");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
