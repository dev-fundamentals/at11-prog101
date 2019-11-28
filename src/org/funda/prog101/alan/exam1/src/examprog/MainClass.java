package examprog;

import java.util.Scanner;

//import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Store");
		Store store = new Store();
		Customer customer = new Customer("alan", 12333, "alan");
		Product product = new HomeVideo(10, "family", "comedy", "spanish");
		int code;
		String name;
		String category;
		int ci ;
		// Here we are adding products to test
		store.addProduct(new Movie(1,"armagedon","action",1998));
		store.addProduct(new Movie(2,"avengers1","action",2012));
		store.addProduct(new Movie(3,"lion king","animation",2019));
		store.addProduct(new VideoGame(4,"starcraft","Strategy","blizzard"));
		store.addProduct(product);

		// here we are adding customers to test
		store.addCustomer(new Customer("laura",82346, "lau"));
		store.addCustomer(new Customer("alvaro",1236, "alva"));
		store.addCustomer(new Customer("marc",5556, "marc"));
		store.addCustomer(customer);

		boolean main = true;
		while (main) {
			System.out.println("Menu Select a option");
			System.out.println("1. Add Product");
			System.out.println("2. Add Customer");
			System.out.println("3. List Customers");
			System.out.println("4. List Products");
			System.out.println("5. Sell a Product");
			System.out.println("6. Rent a Product");
			System.out.println("7. List Products Sold");
			System.out.println("8. List Products sold by customers");
			System.out.println("9. Exit");
			byte op = scan.nextByte();
			switch (op) {
			case 1:
				byte op1 = 0;
				while(op1 !=4) {
					System.out.println("Type of product");
					System.out.println("1. Movie");
					System.out.println("2. VideoGame");
					System.out.println("3. HomeVideo");
					System.out.println("4. Back");
					op1 = scan.nextByte();
					switch (op1) {
					case 1:

						System.out.println("Insert code");
						code = scan.nextInt();
						System.out.println("Insert name");
						name = scan.next();
						System.out.println("Insert category");
						category = scan.next();
						System.out.println("Insert year");
						int year = scan.nextInt();
						store.addProduct(new Movie(code,name,category,year));
						break;
					case 2:
						System.out.println("Insert code");
						code = scan.nextInt();
						System.out.println("Insert name");
						name = scan.next();
						System.out.println("Insert category");
						category = scan.next();
						System.out.println("Insert company");
						String company = scan.next();
						store.addProduct(new VideoGame(code,name,category,company));
						break;
					case 3:
						System.out.println("Insert code");
						code = scan.nextInt();
						System.out.println("Insert name");
						name = scan.next();
						System.out.println("Insert category");
						category = scan.next();
						System.out.println("Insert company");
						String language = scan.next();
						store.addProduct(new HomeVideo(code,name,category,language));
						break;
					default:
						System.out.println("Error! Insert Correct Option!");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Insert name");
				name = scan.next();
				System.out.println("Insert CI");
				ci = scan.nextInt();
				System.out.println("Insert Nick");
				String nick = scan.next();
				store.addCustomer(new Customer(name, ci, nick));
				break;
			case 3:
				store.showCustomers();
				break;
			case 4:
				store.showProducts();
				break;
			case 5:
				boolean option5 = true;
				while (option5) {
					System.out.println("Sell a product");
					System.out.println("1. List Products");
					System.out.println("2. List Customers");
					System.out.println("3. Sell Product");
					System.out.println("4. Back");
					byte op5 = scan.nextByte();
					switch (op5) {
					case 1:
						store.showProducts();
						break;

					case 2:
						store.showCustomers();
						break;
					case 3:
						System.out.println("Select a customer by name");
						name = scan.next();
						System.out.println("Select a product by code");
						code = scan.nextInt();
						customer = store.searchCustomer(name);
						System.out.println("Sold this product ");
						product = store.searchProduct(code);
						store.SellAProduct(product, customer);
						break;
					case 4:
						option5 = false;
						break;

					default:
						break;
					}

				}

				break;
			case 6:
				boolean option6 = true;
				while (option6) {
					System.out.println("Sell a product");
					System.out.println("1. List Products");
					System.out.println("2. List Customers");
					System.out.println("3. Rent Product");
					System.out.println("4. Back");
					byte op6 = scan.nextByte();
					switch (op6) {
					case 1:
						store.showProducts();
						break;

					case 2:
						store.showCustomers();
						break;
					case 3:
						System.out.println("Select a customer by name");
						name = scan.next();
						customer = store.searchCustomer(name);
						System.out.println("Sell this product ");
						System.out.println("Select a product by code");
						code = scan.nextInt();
						product = store.searchProduct(code);
						store.rentAProduct(product, customer);
						break;
					case 4:
						option5 = false;
						break;

					default:
						break;
					}

				}

				break;
			case 7:
				product.showCustomers();
				break;
			case 8:
				customer.showProducts();
				break;
			case 9:
				main = false;
				break;


			default:
				System.out.println("Error! Insert Correct Option!");
				break;
			}

		}

	}

}
