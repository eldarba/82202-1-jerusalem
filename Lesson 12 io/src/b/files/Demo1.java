package b.files;

import java.io.File;

public class Demo1 {

	public static void main(String[] args) {

		File file = new File("c:/temp");
		System.out.println(file);
		System.out.println(file.exists());

		// create directory
		file.mkdirs();

	}

}
