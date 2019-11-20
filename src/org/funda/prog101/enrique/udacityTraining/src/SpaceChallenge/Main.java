package SpaceChallenge;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulation simulation = new Simulation();
		
		String pathPhase1 = "Phase-1.txt";
		String pathPhase2 = "Phase-2.txt";
		
		simulation.loadItems(pathPhase1);
		simulation.loadItems(pathPhase2);
		
		ArrayList<Rocket> rockesU1 = simulation.loadU1();
		ArrayList<Rocket> rockesU2 = simulation.loadU2();
		
		int budgetfleetU1 = simulation.runSimulation(rockesU1);
		int budgetfleetU2 = simulation.runSimulation(rockesU2);
		
		System.out.println("The total budget for U1:" +budgetfleetU1);
		System.out.println("The total budget for U2:" +budgetfleetU2);
	}

}
