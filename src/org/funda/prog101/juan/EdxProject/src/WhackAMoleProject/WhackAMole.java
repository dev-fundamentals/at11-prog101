package WhackAMoleProject;

public class WhackAMole {
	int score;
	int molesLeft; //hoyos
	int attemptsLeft; //restantes
	char[][] moleGrid;
	
	WhackAMole(int numMoles, int numAttempts, int gridDimension)
	{
		this.molesLeft = numMoles;
		this.moleGrid = new char[gridDimension][gridDimension];
		this.attemptsLeft = numAttempts;
		for (int rowGrid = 0; rowGrid < gridDimension; rowGrid++) {
			for (int columnGrid = 0; columnGrid < gridDimension; columnGrid++) {
				moleGrid[rowGrid][columnGrid] = '*';
			}
		}
	}
	
	boolean place(int row, int column)
	{
		if (moleGrid[row][column] == '*') {
			moleGrid[row][column] = 'M';
			return true;
		}
		return false;
	}
	
	void whack(int row, int column)
	{
		if (moleGrid[row][column] == 'M') {
			moleGrid[row][column] = 'W';
			score++;
			attemptsLeft--;
			molesLeft--;
		}
		else
		{
			attemptsLeft--;
		}
	}
	
	void printGridToUser()
	{
		for (int rowGrid = 0; rowGrid < moleGrid.length; rowGrid++) {
			for (int columnGrid = 0; columnGrid < moleGrid.length; columnGrid++) {
				if (moleGrid[rowGrid][columnGrid] == 'W' || moleGrid[rowGrid][columnGrid] == '*') {
					System.out.print(moleGrid[rowGrid][columnGrid] + " ");
				}
			}
			System.out.println("\n");
		}
	}
	
	void printGrid()
	{
		for (int rowGrid = 0; rowGrid < moleGrid.length; rowGrid++) {
			for (int columnGrid = 0; columnGrid < moleGrid.length; columnGrid++) {
				System.out.print(moleGrid[rowGrid][columnGrid] + " ");
			}
			System.out.println("\n");
		}
	}
}
