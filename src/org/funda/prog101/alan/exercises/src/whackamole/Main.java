package whackamole;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		WhackAMole whack = new WhackAMole(50,10);
		Scanner scan = new Scanner(System.in);
		System.out.println("The game has started!");
		boolean numberzero = false;
		boolean surrender = false;
		int x = 0;
		int y = 0 ;

		while ((whack.getAttemps()> 0) && !surrender &&  whack.getMolesLeft() != 0 ) {
			while (!numberzero) {
				try {

					System.out.println("Insert a number [-1 to 10] for a raw: ");
					x= scan.nextInt();
					System.out.println("Insert a number [-1 to 10] for a colum: ");
					y= scan.nextInt();
					if ((x >= -1 && x < 10 ) && (y >= -1 && y < 10 ) ) {
						numberzero = true;
					}
					else {
						System.out.println("Error! Incorrect! Input");
					}

				} catch (Exception e) {
					System.out.println("Please insert a number > 0 ");
				}
			}
			numberzero = false;
			if (x == -1 && y == -1) {
				surrender = true;
			}
			else {
				if (whack.place(x, y)) {
					System.out.println("Mole Found");
				}
				whack.whack(x, y);
				
				whack.printGridToUser();
				System.out.println("You have " + whack.getAttemps()+ " Attempts more" );
				System.out.println("Score " + whack.getScore());
				
			}
			
			
		
		}
		
		if (whack.getMolesLeft() == 0) {
			System.out.println("You Win");
			whack.printGrid();
		}
		else
		{
			System.out.println("You Lose");
			whack.printGrid();
		}
		if (surrender) {
			System.out.println("You have surrendered");
			whack.printGrid();
		}
		
	}

}
