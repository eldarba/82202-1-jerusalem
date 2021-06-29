package e.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1DataToFile {

	public static void main(String[] args) {

		int x = 5;
		double n = 56.32;
		byte y = 30;
		boolean b = true;
		char c = 'A';
		String name = "Moshe";

		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("files/data.data")))) {

			out.writeInt(x);
			out.writeDouble(n);
			out.writeByte(y);
			out.writeBoolean(b);
			out.writeChar(c);
			out.writeUTF(name);

			System.out.println("data written");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
