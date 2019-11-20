package Chess;

public class Bishop extends Piece{
	
	public Bishop(int row, int column) {
		super(row, column);
		// TODO Auto-generated constructor stub
	}

	public boolean isValidMove(Position newPosition) {
		if(Math.abs(newPosition.row - this.position.column) == Math.abs(newPosition.row - this.position.row)) {
			return true;
		}else {
			return false;
		}
	}
	
}
