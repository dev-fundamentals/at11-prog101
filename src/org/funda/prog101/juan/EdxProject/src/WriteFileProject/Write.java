package WriteFileProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter("fileForWriting.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("this is the words for testing file");
			printWriter.flush();
			
			File file = new File("fileForWriting.txt");
			Scanner scanner = new Scanner(file);
			String value = scanner.nextLine();
			System.out.println(value);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
