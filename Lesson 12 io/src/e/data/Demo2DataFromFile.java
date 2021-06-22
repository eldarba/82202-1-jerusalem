package e.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Demo2DataFromFile {

	public static void main(String[] args) {

		try (

				DataInputStream in = new DataInputStream(
						new BufferedInputStream(new FileInputStream("files/data.data")));

		) {

			System.out.println(in.readInt());
			System.out.println(in.readDouble());
			System.out.println(in.readByte());
			System.out.println(in.readBoolean());
			System.out.println(in.readChar());
			System.out.println(in.readUTF());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
