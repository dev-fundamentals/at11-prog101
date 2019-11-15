package whackamole;
import java.util.Random;

public class WhackAMole {

	//score, molesLeft, and attemptsLeft.
	private int score;
	private int molesLeft;
	private int attemptsLeft;
	private char [] [] moleGrid;
	private char [] [] moleGridUser;
	private Random random;
	public WhackAMole (int numAttempts, int gridDimension) {
		attemptsLeft = numAttempts;
		score = 0;
		moleGrid = new char [gridDimension] [gridDimension];
		moleGridUser = new char [gridDimension] [gridDimension];
		random = new Random();
		for (int i = 0; i < moleGridUser.length ; i++) {
			for (int j = 0; j < moleGridUser.length ; j++) {
				moleGridUser[i][j] = '*';
			}
		}
		
		while(molesLeft < 10) {
			for (int i = 0; i < moleGrid.length ; i++) {
				for (int j = 0; j < moleGrid.length ; j++) {

					if (random.nextInt(2) == 0 && molesLeft < 10) {
						moleGrid[i][j] = 'M';
						this.molesLeft++;
					}
					else {
						moleGrid[i][j] = '*';
					}
				}
			}
		}

	}
	public int getAttemps(){
		return this.attemptsLeft;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public int getMolesLeft() {
		return this.molesLeft;
	}
	
	public boolean place(int x, int y) {
		if (moleGrid[x][y] == 'M') {
			molesLeft--;
			score++;
			return true;
		}
		return false;
	}
	public void whack (int x, int y) {
		
			moleGridUser [x][y] = 'W';
			attemptsLeft--;
		
		
	}
	public void printGridToUser() {
		for (int i = 0; i < moleGridUser.length; i++) {
			for (int j = 0; j < moleGridUser.length; j++) {
				System.out.print(moleGridUser[i][j]); 
			}
			System.out.println();
		}
	}

	void printGrid() {
		for (int i = 0; i < moleGrid.length; i++) {
			for (int j = 0; j < moleGrid.length; j++) {
				System.out.print(moleGrid[i][j]); 
			}
			System.out.println();
		}
	}
}
