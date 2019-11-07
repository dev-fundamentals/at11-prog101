package Chess;

public class Rock extends Piece{
	
	public boolean isValidMove(Position newPosition) {
		if(newPosition.row == this.position.column || newPosition.row == this.position.row) {
			return true;
		}else {
			return false;
		}
	}
	
}
