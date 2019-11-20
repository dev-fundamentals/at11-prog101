package GuessTheMovie;

import java.util.Scanner;

public class MovieTitle {
	
	private String title;
	
	public MovieTitle() {
		title = getrandomTitleMovie();
	}
	
	private static String [] chargeListMovies(Scanner scanner) {
		int numberMovies = 200;

		String [] listMovies = new String [numberMovies];
		
		int index = 0;
		
		while (scanner.hasNext()) {
			listMovies[index] = scanner.nextLine();
			index ++;
		}
		return listMovies;
	}
	
	private String getrandomTitleMovie() {
		int numberRandom = (int) (Math.random() * 200) + 1;
		
		TxtFile txtfile = new TxtFile();
		Scanner scannerfiletxt = txtfile.getTextScann();
		
		String [] movieList = chargeListMovies(scannerfiletxt);
		
		return movieList [numberRandom].toString();
	}
	
	public String getmovieTitle() {
		return title;
	}
}
