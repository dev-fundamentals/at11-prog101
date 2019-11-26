package GuessMovie;

//import com.sun.org.apache.xpath.internal.FoundIndex;

public class Game {
	private String nameMovie;
	private Movie movie;
	private String movieEncripted;
	private int guesses;
	private char [] movieChar;
	private char [] movieEncryptedChar;
	private int letterGuessed;
	private String lettersAlreadyGuessed;
	public Game(int namemovie) {
		movie = new Movie();
		nameMovie = movie.selectMovie(namemovie);
		movieEncripted = nameMovie.replaceAll("[a-z]", "_");
		guesses = 10;
		letterGuessed = 0;
		lettersAlreadyGuessed = "";
		movieChar = nameMovie.toCharArray();
		movieEncryptedChar = movieEncripted.toCharArray();
		System.out.println("Let's Start the Game. It's a movie with "+ nameMovie.length() + " Letters");
		System.out.println("You're guessing: "+ movieEncripted);
	}
	
	public String searchLetter(char letterSended) {
		// TODO Auto-generated method stub
		int cont = 0;
		
		if (guesses == 0) {
			System.out.println("You Don't have chances. Game Over");
			return "Game Over";
		}
		else{
			
			if (letterFound(letterSended)) {
				System.out.println("Guess a letter: "+ letterSended);
				System.out.println("This letter: " + letterSended +" has already been guessed!");
				System.out.println("You are guessing: " + String.valueOf(movieEncryptedChar));
				return String.valueOf(movieEncryptedChar);
			}
			else {
				System.out.println("Guess a letter: "+ letterSended);
				for (int i = 0; i < movieChar.length; i++) {
					
					if (movieChar[i]==letterSended) {
						movieEncryptedChar[i]= letterSended;
						lettersAlreadyGuessed +=letterSended;
						letterGuessed++;
					}
					else {
						cont ++;
					}
				}
				
				if (cont >= movieChar.length) {
					guesses--;
					System.out.println("Error! you have "+ guesses +" chances more." );
					System.out.println("You are guessing: "+ String.valueOf(movieEncryptedChar));
					if (guesses == 0) {
						System.out.println("You Don't have chances. Game Over");
						return "Game Over";
					}
					return String.valueOf(movieEncryptedChar);
				}
				else {
					if (String.valueOf(movieChar).equals(String.valueOf(movieEncryptedChar))){
						System.out.println("Congratulation!!! YOU WIN");
						return "You Win";
					}
					System.out.println("You have gessed : "+ letterGuessed + " letters");
					System.out.println("You are guessing: "+ String.valueOf(movieEncryptedChar));
					return String.valueOf(movieEncryptedChar);
				}
			}
			
		}
		
	}
	
	private boolean letterFound(char letter) {
		boolean found = false;
		char [] charLetterAlreadyGuessed = lettersAlreadyGuessed.toCharArray();
		for (int j = 0; j < charLetterAlreadyGuessed.length; j++) {
			if (charLetterAlreadyGuessed[j]==letter) {
				found = true;
				return found;
			}
		}
		return found;
	}

}
