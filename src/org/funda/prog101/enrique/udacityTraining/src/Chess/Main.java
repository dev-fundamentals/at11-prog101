package Chess;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Position newPosition = new Position(6, 3);
		Position newPosition1 = new Position(6, 5);
		
		
		Queen queen = new Queen(8, 5);
		
		boolean aux = queen.isValidMove(newPosition);
		boolean aux1 = queen.isValidMove(newPosition1);
		
		System.out.println("Child:");
		System.out.println(aux);
		System.out.println(aux1);
	}

}
