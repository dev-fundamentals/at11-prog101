package GuessTheMovie;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TxtFile {
	
	private String path = "Movies.txt";
	
	public Scanner getTextScann() {
		File file = new File(path);
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return scanner;
	}
	
	
}
