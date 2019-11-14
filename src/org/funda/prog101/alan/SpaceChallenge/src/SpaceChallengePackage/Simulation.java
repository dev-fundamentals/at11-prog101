package SpaceChallengePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Simulation {
	private Item item;
	private ArrayList<Item> newItem;
	File listItems;
	Scanner fileScanner;
	public Simulation() {
		newItem = new ArrayList<Item>();
		listItems = new File ("phase1-2.txt");
	}

	public void loadItems( ) {
		
		try {
			fileScanner = new Scanner(listItems);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String [] lineArray;
		while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				lineArray = line.split("=");
				item = new Item();
				item.name = lineArray[0];
				item.weight = Integer.valueOf(lineArray[1]);
				newItem.add(item);
			   // Use that line to do any calculations, processing, etc ..
			}
		
	}	
	
	public ArrayList<ArrayList<Item>> loadU1(){
		ArrayList<ArrayList<Item>> arrayU1 = new ArrayList<>();

		Rocket rocket1 = new Rocket(18000);
		for (int i = 0; i < newItem.size(); i++) {
			if (rocket1.canCarry(newItem.get(i))) {
				rocket1.RoketItems.add(newItem.get(i));
			}
			else {
				arrayU1.add(rocket1.RoketItems);
				rocket1 = new Rocket(18000);
				rocket1.RoketItems.add(newItem.get(i));
			}
		}
		return arrayU1;
		
	}
	public ArrayList<ArrayList<Item>> loadU2(){
		ArrayList<ArrayList<Item>> arrayU2 = new ArrayList<>();

		Rocket rocket2 = new Rocket(29000);
		for (int j = 0; j < newItem.size(); j++) {
			if (rocket2.canCarry(newItem.get(j))) {
				rocket2.RoketItems.add(newItem.get(j));
			}
			else {
				arrayU2.add(rocket2.RoketItems);
				rocket2 = new Rocket(18000);
				rocket2.RoketItems.add(newItem.get(j));
			}
		}
		return arrayU2;
		
	}
	public String runSimulation() {
		int carryWeight = 0;
		int countU1 = 0; 
		int bugetU1 = 0;
		int countU2 = 0; 
		int bugetU2 = 0;
		U1 u1;
		U2 u2;
		ArrayList<ArrayList<Item>> rocketsU1 = loadU1();
		ArrayList<ArrayList<Item>> rocketsU2 = loadU2();
		for (int i = 0; i < rocketsU1.size(); i++) {
			for (int j = 0; j < rocketsU1.size(); j++) {
				carryWeight += rocketsU1.get(i).get(j).weight;
			}
			u1 = new U1(18000,carryWeight);
			if (u1.land() && u1.launch()) {
				countU1++;
			}
			else {
				while (!(u1.land() && u1.launch())) {
					countU1++;
				}
			}
			carryWeight = 0 ;
		}
		bugetU1 = countU1 * 100;
		carryWeight = 0 ;
		for (int i = 0; i < rocketsU2.size(); i++) {
			for (int j = 0; j < rocketsU2.size(); j++) {
				carryWeight += rocketsU2.get(i).get(j).weight;
			}
			u2 = new U2(29000,carryWeight);
			if (u2.land() && u2.launch()) {
				countU2++;
			}
			else {
				while (!(u2.land() && u2.launch())) {
					countU2++;
				}
			}
			carryWeight = 0 ;
		}
		bugetU2 = countU2 * 120;
		
		return "Buget U1: " + bugetU1 + " millions with "+ countU1 + " rokets"+"\n" + 
				"Buget U2: "+ bugetU2 + " millions with "+ countU2 + " rokets";
	}
	
	
	
}
