package SpaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Simulation {
	
	private ArrayList<Item> listItems = new ArrayList<>();
	
	public ArrayList<Item> loadItems(String pathFile){
		File file = new File(pathFile);
		
		try {
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext()) {
				String textLine = scanner.nextLine();
				String textLinesplit [] = textLine.split("=");
				
				Item item = new Item(textLinesplit[0].toString(), 
						Integer.parseInt(textLinesplit[1].toString()));
				listItems.add(item);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listItems;
	}
	
	public ArrayList<Rocket> loadU1(){
		ArrayList<Rocket> rocketsU1 = new ArrayList<>();
		
		U1 u1 = new U1();
		
		for (Item item : listItems) {
			if (u1.canCarry(item)) {
				u1.carry(item);
			}else {
				rocketsU1.add(u1);
				u1 = new U1();
			}
		}
		return rocketsU1;
	}
	
	public ArrayList<Rocket> loadU2(){
		ArrayList<Rocket> rocketsU2 = new ArrayList<>();
		
		U2 u2 = new U2();
		
		for (Item item : listItems) {
			if (u2.canCarry(item)) {
				u2.carry(item);
			}else {
				rocketsU2.add(u2);
				u2 = new U2();
			}
		}
		return rocketsU2;
	}
	
	public int runSimulation(ArrayList<Rocket> rockets) {
		int numberLunches = 0;
		for (Rocket rocket : rockets) {
			numberLunches++;
			if(!(rocket.launch() || rocket.land())) {
				numberLunches++;
			}
		}
		numberLunches = numberLunches * rockets.get(0).cost;
		
		return numberLunches;
	}

}
