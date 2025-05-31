package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
			// Actually, you cannot use BufferedReader to write to a file — it's designed
			// only for reading.
			BufferedReader reader = new BufferedReader(new FileReader("exampleread.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close(); // Always close the reader
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
