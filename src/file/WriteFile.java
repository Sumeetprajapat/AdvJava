package file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("examplewrite.txt");
			writer.write("Hello, world!\nThis is a file in Java.");
			writer.close(); // Always close the writer
			System.out.println("File written successfully.");
			System.out.println("File will be created in: " + System.getProperty("user.dir"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
