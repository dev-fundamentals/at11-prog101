package Chess;

public class Queen extends Piece{
	
	public boolean isValidMove(Position newPosition) {

		if (isValidMoveAsRock(newPosition) || isValidMoveAsBichop(newPosition)) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isValidMoveAsRock(Position newPosition) {
		if(newPosition.column == this.position.column || newPosition.row == this.position.row) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean isValidMoveAsBichop(Position newPosition) {
		if(Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)) {
			return true;
		}else {
			return false;
		}
	}
	
}
