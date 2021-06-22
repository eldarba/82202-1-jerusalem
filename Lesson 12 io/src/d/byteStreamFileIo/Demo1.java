package d.byteStreamFileIo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {

		File file1 = new File("files/ronaldo.jpg");
		File file2 = new File("files/ronaldoCopy.jpg");

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file1));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file2));) {

			System.out.println("available bytes : " + in.available());

			int b = in.read(); // read the first byte
			while (b != -1) {
				out.write(b); // write current byte to file
				b = in.read(); // read the next byte
			}

			System.out.println(file1);
			System.out.println("copied to");
			System.out.println(file2);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
