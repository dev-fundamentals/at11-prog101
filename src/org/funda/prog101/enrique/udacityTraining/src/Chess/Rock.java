package Chess;

public class Rock extends Piece{
	
	public Rock(int row, int column) {
		super(row, column);
		// TODO Auto-generated constructor stub
	}

	public boolean isValidMove(Position newPosition) {
		if(newPosition.row == this.position.column || newPosition.row == this.position.row) {
			return true;
		}else {
			return false;
		}
	}
	
}
