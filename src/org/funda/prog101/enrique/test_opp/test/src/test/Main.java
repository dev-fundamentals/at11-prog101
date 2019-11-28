package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> actorsMovie1 = new ArrayList<String>();
		actorsMovie1.add("Adam West");
		actorsMovie1.add("Sara Stone");
		
		ArrayList<String> actorsMovie2 = new ArrayList<String>();
		actorsMovie2.add("Miley Cirus");
		actorsMovie2.add("Sara Stone");
		
		Game game1 = new Game("Start Craft", "Strategy", 24.5, "Windows 10");
		Game game2 = new Game("Mario", "Strategy", 24.5, "Windows 10");
		Game game3 = new Game("Boberman", "Strategy", 24.5, "Windows 10");
		
		Movie movie1 = new Movie("Break Ball", "action", 0.99, actorsMovie2);
		Movie movie2 = new Movie("Wason", "action", 0.99, actorsMovie2);
		
		Store store = new Store();
		store.addProduct(game1);
		store.addProduct(game2);
		store.addProduct(game3);
		store.addProduct(movie1);
		store.addProduct(movie2);
		
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		String message;
		
		System.out.println("---Disk Shop---");
		System.out.println("1. Serch Product");
		System.out.println("2. Rent Product");
		System.out.println("3. Sell Product");
		
		opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1:
			scanner.nextLine();
			System.out.println("Type a Title");
			message = scanner.nextLine();
			store.searchProductAviable(message).print();
			break;
			
		case 2:
			scanner.nextLine();
			System.out.println("Type a Title");
			store.printProducts();
			message = scanner.nextLine();
			store.rentProduct(message);
			store.searchProduct(message).print();
			System.out.println("Rent Completed");
			break;
			
		case 3:
			scanner.nextLine();
			System.out.println("Type a Title");
			store.printProducts();
			message = scanner.nextLine();
			store.sellProduct(message);
			store.searchProduct(message).print();
			System.out.println("Sell Completed");
			break;

		default:
			break;
		}
		
	}

}
