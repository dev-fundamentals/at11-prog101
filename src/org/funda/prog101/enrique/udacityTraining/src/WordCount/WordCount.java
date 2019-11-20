package WordCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
	
	public static void main(String [] args) throws FileNotFoundException {
		File file = new File("poema.txt");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		
		int wordsNumber = 0;
		
		while (scanner.hasNextLine()) {
			String sentences = scanner.nextLine();
			wordsNumber += sentences.split(" ").length;
		}
		
		System.out.println("Number of words is: " + wordsNumber);
	}
}
