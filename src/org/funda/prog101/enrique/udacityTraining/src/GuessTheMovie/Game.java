package GuessTheMovie;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTitle movieTitle = new MovieTitle();
		HiderTextLine hiderTextLine = new HiderTextLine();
		
		Scanner readLetter = new Scanner(System.in);
		
		int wrongLetters = 0;
		
		String movieTitleToGuess = movieTitle.getmovieTitle();
		String movieTitleToShow = hiderTextLine.hideMovieTitle(movieTitleToGuess);
		String movieTitleToShowNew = "";
		String letterAnswer;
		
		System.out.println("Welcome to Guess The Movie");
		
		while (wrongLetters < 10) {
			System.out.println("You are guessing: " + movieTitleToShow);
			System.out.println("You have guessed(" + wrongLetters + ") wrong letters");
			System.out.println("Guess a letter: ");
			
			letterAnswer = readLetter.nextLine();
					
			boolean verifiderWrongLetter = hiderTextLine.uploadRegex(letterAnswer);
			movieTitleToShowNew = hiderTextLine.hideMovieTitle(movieTitleToGuess);
			
			if (movieTitleToGuess.compareTo(movieTitleToShowNew) == 0) {
				System.out.println("You Win!");
				System.out.println("Oportunities: " + wrongLetters);
				wrongLetters = 0;
			}else {
				if (movieTitleToShowNew.compareTo(movieTitleToShow) == 0 && verifiderWrongLetter) {
					wrongLetters ++;
				}
			}
			movieTitleToShow = movieTitleToShowNew;
			
			if (wrongLetters == 10) {
				System.out.println("You Lose!");
				System.out.println("Oportunities: " + wrongLetters);
			}
		}
		System.out.println("The movie is: " + movieTitleToGuess);		
	}
}
