package a.defaultIOObjects;

import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {

		int b = System.in.read(); // read the first byte from the stream
		while (b != 13) { // 13 is line terminator (enter)
			System.out.write(b); // write the current byte
			b = System.in.read(); // read the next byte from the stream
		}

		System.out.flush(); // flush the current byte (empty the buffer)

		byte[] bufer = new byte[5];
		System.in.read(bufer);

	}

}
