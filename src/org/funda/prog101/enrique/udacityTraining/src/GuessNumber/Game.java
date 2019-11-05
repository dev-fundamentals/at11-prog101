package GuessNumber;

import java.util.Scanner;

public class Game {
	
	public static void main(String [] args) {
		int numberToGuess = (int) (Math.random() * 100) + 1;
		int numberAnswer;
		int oportunities = 10;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wellcome to Guess The Number\nYou have 10 tries");
		
		for (int i = 0; i < oportunities; i++) {
			int oportunitiesLeft = i - oportunities - 1;
			System.out.println("Introduce your answer: ");
			numberAnswer = Integer.parseInt(scanner.nextLine());
			
			if (numberAnswer == numberToGuess) {
				System.out.println("You Win!\nThe answer is: " + numberAnswer);
				i = 10;
			}else if (numberAnswer > numberToGuess) {
				System.out.println("The number is less than: " + numberAnswer + "\n");
				System.out.println("You have: " + oportunitiesLeft + " times left" + "\n");
			} else {
				System.out.println("The number is more than: " + numberAnswer + "\n");
				System.out.println("You have: " + oportunitiesLeft + " times left" + "\n");
			}
			
			if (i == 9) {
				System.out.println("You lose!\nThe answer was: " + numberToGuess + "\n");
			}
		}
		System.out.println("GAME OVER");
	}
}
