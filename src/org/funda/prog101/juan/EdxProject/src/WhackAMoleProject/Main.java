package WhackAMoleProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhackAMole whackAMole;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of attempts ");
		int attemptValue = scanner.nextInt();
		System.out.println("Enter grid dimension ");
		int dimesionValue = scanner.nextInt();
		System.out.println("Enter number of moles ");
		int molesValue = scanner.nextInt();
		whackAMole = new WhackAMole(molesValue, attemptValue, dimesionValue);
		
		int moleCounter = 0;
		while (moleCounter <= whackAMole.molesLeft) {
			
			int molesSize = whackAMole.moleGrid[0].length -1;
			int row = (int)(Math.random() * molesSize + 0);
			int column = (int)(Math.random() * molesSize + 0);
			if (whackAMole.place(row, column))
			{
				moleCounter++;
			}
		}
		
		int attemptsCounter = 0;
		int giveUpNumber = -1;
		while (attemptsCounter < whackAMole.attemptsLeft) {
			
			System.out.println("Enter row value ");
			int rowInput = scanner.nextInt();
			System.out.println("Enter column value ");
			int columnInput = scanner.nextInt();
			
			int gridSize = whackAMole.moleGrid[0].length - 1;
			
			if (rowInput >= 0 && rowInput <= gridSize
				&& columnInput >= 0 && columnInput <= gridSize) {
				whackAMole.whack(rowInput, columnInput);
			}
			else if (rowInput == giveUpNumber && columnInput == giveUpNumber) {
				System.out.println("Give up");
				whackAMole.printGrid();
				break;
			}
			System.out.println("attempts left " + whackAMole.attemptsLeft);
			if (whackAMole.molesLeft == 0) {
				System.out.println("you Win... ");
				whackAMole.printGridToUser();
				break;
			}
		}
		scanner.close();
		System.out.println("This is the complete GRID\n");
		whackAMole.printGrid();
	}

}
