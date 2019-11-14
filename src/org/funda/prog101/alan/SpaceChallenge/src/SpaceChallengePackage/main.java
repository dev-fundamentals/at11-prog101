package SpaceChallengePackage;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("trying the software");
		Simulation simulation = new Simulation();
		simulation.loadItems();
		System.out.println(simulation.runSimulation());
	}

}
