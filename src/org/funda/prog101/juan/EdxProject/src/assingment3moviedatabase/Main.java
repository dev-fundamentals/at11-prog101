package assingment3moviedatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		MovieDatabase movieDatabase = new MovieDatabase();
		File fileMovies = new File("movies.txt");
		File fileRatings = new File("ratings.txt");
		Scanner scannerMovie = new Scanner(fileMovies);
		Scanner scannerRating = new Scanner(fileRatings);
		ArrayList<String> movieRows = new ArrayList<String>();
		ArrayList<String> ratingRows = new ArrayList<String>();
		while (scannerMovie.hasNext()) {
			movieRows.add(scannerMovie.nextLine());
		}
		while (scannerRating.hasNext()) {
			ratingRows.add(scannerRating.nextLine());
		}
		
		for (String string : movieRows) {
			String[] actorsName = new String [1];
			int actorItem = 0;
			String[] lineSplit = string.split(", ");
			String actor = lineSplit[actorItem]; 
			for (int item = 0; item < lineSplit.length; item++) {
				if (item == actorItem) {
					actorsName[item] = lineSplit[item];
				}
				else {
					String movieName = lineSplit[item];
					movieDatabase.addMovie(movieName, actorsName);
					movieDatabase.addActor(actor, movieName);
				}
			}	
		}
		
		int cont = 0;
		for (String string : ratingRows) {
			char[] arrayString = string.toCharArray();
			int lastPosition = 0;
			for (int item = 0; item < string.length(); item++) {
				if (arrayString[item] == ' ' || arrayString[item] == '\t') {
					lastPosition = item;
				}
			}
			String movieName = string.substring(0, lastPosition);
			String score = string.substring(lastPosition + 1, string.length());
			
			if (cont > 0) {
				int rating = Integer.parseInt(score);
				movieDatabase.addRating(movieName, rating);
				movieDatabase.updateRating(movieName, rating);
				cont++;
			}
			else
				cont++;
		}
		
		String bestActor = movieDatabase.getBestActor();
		System.out.println("The best actor is: " + bestActor);
		System.out.println("");
		String bestMovie = movieDatabase.getBestMovie();
		System.out.println("The best movie is: " + bestMovie);
		scannerMovie.close();
		scannerRating.close();
	}

}
