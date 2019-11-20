package Chess;

public class Piece {
	
	Position position;
	
	public Piece(int row, int column) {
		position = new Position(row, column);
		position.row = row;
		position.column = column;
	}
	
	public boolean isValidMove(Position newPosition) {
		return (newPosition.row > 0 && newPosition.row < 8) && (newPosition.column > 0 && newPosition.column < 8);
	}
	
}
