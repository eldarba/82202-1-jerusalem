package b.files;

import java.io.File;

public class Demo3 {

	public static void main(String[] args) {

		File directory = new File("files"); // relative path
//		File file = new File("c:/temp/letter.txt");
		File file = new File(directory, "letter.txt");

		try {
			// create a directory
			directory.mkdirs();
			System.out.println("deirectory created or exited");
			// create a file in the directory
			file.createNewFile();
			System.out.println("file created or exited");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
