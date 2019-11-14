package Assignment2Project;

import java.util.Arrays;

public class Squarelotron {
	int [][] squarelotron;
	int size;
	
	public Squarelotron()
	{}
	
	public Squarelotron(int inputSize)
	{
		this.size = inputSize;
		squarelotron = new int[this.size][this.size];
		int counter = 1;
		for (int row = 0; row < this.size; row++) {
			for (int column = 0; column < this.size; column++) {
				squarelotron[row][column] = counter;
				counter++;
			}
		}		
	}
	
	Squarelotron upsideDownFlip(int inputRing)
	{
		if(inputRing + 2 == size)
			return null;
		Squarelotron newSquarelotron = new Squarelotron(this.size);
		int itemOne = inputRing - 1;
		int itemTwo = size - inputRing;
		
		int rowInit = inputRing - 1;
		int rowEnd = size - inputRing;
		
		int columnInit = inputRing;
		int columnEnd = size - (inputRing + 1);
		int columnOne = columnEnd;
		int columnTwo = columnEnd;
		
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				
				if (row == itemOne && column >= rowInit && column <= rowEnd) {
					int value = squarelotron[itemTwo][column];
					newSquarelotron.squarelotron[itemOne][column] = value;
				}
				if (row == itemTwo && column >= rowInit && column <= rowEnd) {
					int value = squarelotron[itemOne][column];
					newSquarelotron.squarelotron[itemTwo][column] = value;
				}
				if (column == itemOne && row >= columnInit && row <= columnEnd
						&& columnInit <= columnOne) {
					int value = squarelotron[row][itemOne];
					newSquarelotron.squarelotron[columnOne][itemOne] = value;
					columnOne--;
				}
				if (column == itemTwo && row >= columnInit && row <= columnEnd
						&& columnInit <= columnTwo) {
					int value = squarelotron[row][itemTwo];
					newSquarelotron.squarelotron[columnTwo][itemTwo] = value;
					columnTwo--;
				}
			}
		}
		return newSquarelotron;
	}
	
	Squarelotron mainDiagonalFlip(int ring)
	{
		if(ring + 2 == size)
			return null;
		Squarelotron newSquarelotron = new Squarelotron(this.size);
		int itemOne = ring - 1;
		int itemTwo = size - ring;
		
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				if (row == column) {
					continue;
				}
				if (row == itemOne) {
					int valueOne = squarelotron[row][column];
					newSquarelotron.squarelotron[column][itemOne] = valueOne;
					int valueTwo = squarelotron[column][row];
					newSquarelotron.squarelotron[itemOne][column] = valueTwo;
				}
				if (column == itemTwo) {
					int valueOne = squarelotron[row][itemTwo];
					newSquarelotron.squarelotron[itemTwo][row] = valueOne;
					int valueTwo = squarelotron[itemTwo][row];
					newSquarelotron.squarelotron[row][itemTwo] = valueTwo;
				}
			}
		}
		return newSquarelotron;
	}
	
	void rotateRight(int numberOfTurns)
	{
		int counter = 0;
		int newColumn = 0;
		int newRow = 0;
		int iterator = 0;
		int limit = Math.abs(numberOfTurns);
		
		while (counter < limit) {
			Squarelotron newSquarelotron = new Squarelotron(this.size);
			if (numberOfTurns == 0)
				break;
			if (numberOfTurns > 0)
				newColumn = size - 1;
			else
				newRow = 0;
			for (int row = 0; row < size; row++) {
				iterator = size - 1;
				for (int column = 0; column < size; column++) {
					int value = this.squarelotron[row][column];
					if (numberOfTurns > 0) {
						newSquarelotron.squarelotron[column][newColumn] = value;
					}
					else {
						newSquarelotron.squarelotron[iterator][newRow] = value;
						iterator--;
					}
				}
				if (numberOfTurns > 0)
					newColumn--;
				else
					newRow++;
			}
			this.squarelotron = Arrays.copyOf(newSquarelotron.squarelotron, size);
			counter++;
		}
	}
}
