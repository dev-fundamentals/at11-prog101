package GuessNumber;

import java.util.Scanner;

public class Game {
	
	public static void main(String [] args) {
		int numberToGuess = (int) (Math.random() * 100) + 1;
		int numberAnswer;
		int oportunities = 10;
		int lastChance = 9;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wellcome to Guess The Number\nYou have 10 tries");
		
		for (int i = 0; i < oportunities; i++) {
			int oportunitiesLeft =  oportunities - i -1;
			System.out.println("Introduce your answer: ");
			numberAnswer = Integer.parseInt(scanner.nextLine());
			
			if (numberAnswer == numberToGuess) {
				System.out.println("You Win!\nThe answer is: " + numberAnswer);
				i = oportunities;
			}else if (numberAnswer > numberToGuess) {
				System.out.println("The number is less than: " + numberAnswer + "\n");
				System.out.println("You have: " + oportunitiesLeft + " chance left" + "\n");
			} else {
				System.out.println("The number is more than: " + numberAnswer + "\n");
				System.out.println("You have: " + oportunitiesLeft + " chance left" + "\n");
			}
			
			if (i == lastChance) {
				System.out.println("You lose!\nThe answer was: " + numberToGuess + "\n");
			}
		}
		System.out.println("GAME OVER");
	}
}
