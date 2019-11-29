package examoop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee(11, "Juan", 25, "male", 1);
		Employee employee2 = new Employee(12, "Alicia", 23, "female", 2);
		Employee employee3 = new Employee(13, "Jose", 22, "male", 3);
		
		Manager manager = new Manager(3, "Pepe", 20, "male", 1);
		
		Customer customer1 =  new Customer(1, "Alexia", 23, "female", 1);
		Customer customer2 =  new Customer(2, "Bety", 22, "female", 2);
		Customer customer3 =  new Customer(3, "Brandon", 21, "male", 3);
		Customer customer4 =  new Customer(4, "Sofy", 20, "female", 4);
		Customer customer5 =  new Customer(5, "Frank", 24, "male", 5);
		
		Movie movie1 = new Movie(1, "Navidad", ProdutCategory.Comic,
								ProductStatus.InStoreAvailable, 2.2, 2011, MovieState.New);
		Movie movie2 = new Movie(2, "Rambo", ProdutCategory.Accion,
								ProductStatus.InStoreAvailable, 3.3, 2004, MovieState.Viewed);
		Movie movie3 = new Movie(3, "Batman", ProdutCategory.Comic,
								ProductStatus.InStoreAvailable, 4.3, 2017, MovieState.New);
		
		TvShow tvShow1 = new TvShow(4, "Friends", ProdutCategory.Comic, 
								ProductStatus.InStoreAvailable, 2.1, LocalDate.of(2001, 11, 02));
		TvShow tvShow2 = new TvShow(5, "The Big Bang", ProdutCategory.Serie, 
								ProductStatus.InStoreDamaget, 3.2, LocalDate.of(2002, 11, 02));
		TvShow tvShow3 = new TvShow(6, "Calle 7", ProdutCategory.Comic, 
								ProductStatus.InStoreAvailable, 3.4, LocalDate.of(2001, 11, 02));
		TvShow tvShow4 = new TvShow(7, "Pecados", ProdutCategory.Terror, 
								ProductStatus.InStoreAvailable, 5.1, LocalDate.of(2011, 11, 02));
		
		VideoGame videoGame1 = new VideoGame(8, "Mario bross", 
								ProdutCategory.Accion, ProductStatus.InStoreDamaget, 4.4, "2.2");
		VideoGame videoGame2 = new VideoGame(9, "Call Of Dutty", 
								ProdutCategory.Accion, ProductStatus.InStoreAvailable, 3.3, "2.4");
		VideoGame videoGame3 = new VideoGame(10, "Angy birds", 
								ProdutCategory.Comic, ProductStatus.InStoreAvailable, 5.1, "2.3");
		Store store = new Store(1, manager);
		
		store.addEmployee(employee1);
		store.addEmployee(employee2);
		store.addEmployee(employee3);
		
		store.addCustomer(customer1);
		store.addCustomer(customer2);
		store.addCustomer(customer3);
		store.addCustomer(customer4);
		store.addCustomer(customer5);
		
		store.addProduct(movie1);
		store.addProduct(movie2);
		store.addProduct(movie3);
		
		store.addProduct(tvShow1);
		store.addProduct(tvShow2);
		store.addProduct(tvShow3);
		store.addProduct(tvShow4);
		
		store.addProduct(videoGame1);
		store.addProduct(videoGame2);
		store.addProduct(videoGame3);
		
		System.out.println("Welcome to CenterShop Store");
		int value = -1;
		Scanner shop = new Scanner(System.in);
		while(value != 0)
		{
			System.out.println("option 1: Add Customer ");
			System.out.println("option 2: Add Movie ");
			System.out.println("option 3: Add TvShow ");
			System.out.println("option 4: Add VideoGame ");
			System.out.println("option 5: List products ");
			System.out.println("option 6: find product ");
			System.out.println("option 7: find products ");
			System.out.println("option 8: rent products ");
			System.out.println("option 9: Buy products ");
			System.out.println("Exit: option 0 ");
			value = shop.nextInt();
			if (value == 1) {
				System.out.println("CI ");
				int ci = shop.nextInt();
				System.out.println("Name ");
				String name = shop.next();
				System.out.println("Age ");
				int age = shop.nextInt();
				System.out.println("Gender ");
				String gender = shop.next();
				System.out.println("ID ");
				int id = shop.nextInt();
				Customer customer = new Customer(ci, name, age, gender, id);
				store.addCustomer(customer);
				System.out.println("Created successfully ");
			}
			if (value == 2) {
				System.out.println("ID ");
				int id = shop.nextInt();
				System.out.println("Title ");
				String title = shop.next();
				System.out.println("Price ");
				double price = shop.nextDouble();
				System.out.println("Year ");
				int year = shop.nextInt();
				Movie movi = new Movie(id, title, ProdutCategory.Accion, 
						ProductStatus.InStoreAvailable, price, year, MovieState.New);
				store.addProduct(movi);
				System.out.println("Created successfully ");
			}
			if (value == 3) {
				System.out.println("ID ");
				int id = shop.nextInt();
				System.out.println("Title ");
				String title = shop.next();
				System.out.println("Price ");
				double price = shop.nextDouble();
				System.out.println("Year ");
				int year = shop.nextInt();
				TvShow tv = new TvShow(id, title, ProdutCategory.Accion, 
						ProductStatus.InStoreAvailable, price, LocalDate.of(2001, 11, 02));
				store.addProduct(tv);
				System.out.println("Created successfully ");
			}
			if (value == 4) {
				System.out.println("ID ");
				int id = shop.nextInt();
				System.out.println("Title ");
				String title = shop.next();
				System.out.println("Price ");
				double price = shop.nextDouble();
				System.out.println("Year ");
				int year = shop.nextInt();
				VideoGame vg = new VideoGame(id, title, ProdutCategory.Accion, 
						ProductStatus.InStoreAvailable, price, "3.3");
				store.addProduct(vg);
				System.out.println("Created successfully ");
			}
			
			if (value == 5) {
				ArrayList<Product> list = store.getProducts();
				System.out.println("id |" + "title |" + " category |" + "       price " );
				for (Product product : list) {
						System.out.println(product.id + " | " + product.title + " | "
								+ product.category + " | " + product.status + " | " + product.price);
				}
			}
			
			if (value == 6) {
				System.out.println("Enter Product ID");
				int id = shop.nextInt();
				Product product = store.findProduct(id);
				System.out.println("id |" + "title |" + " category |" + "       price |" );
						System.out.println(product.id + " |" + product.title + " |"
								+ product.category + " |" + product.status + " |" + product.price);
			}
			
			if (value == 7) {
				System.out.println("Enter Product ID");
				int id = shop.nextInt();
				int[] ids = new int[1];
				ArrayList<Product> list = store.getProducts();
				System.out.println("id |" + "title |" + " category |" + "       price " );
				for (Product product : list) {
						System.out.println(product.id + " | " + product.title + " | "
								+ product.category + " | " + product.status + " | " + product.price);
				}
			}
			
			if (value == 8) {
				int [] productList = new int [1];
				System.out.println("Enter store ID");
				int sid = shop.nextInt();
				System.out.println("Enter Customer ID");
				int cid = shop.nextInt();
				System.out.println("Enter Product ID");
				int ide = shop.nextInt();
				
				productList[0] = ide;
				store.rent(sid, cid, ConditionType.Explicit, productList);
			}
			
			if (value == 9) {
				int [] productList = new int [1];
				System.out.println("Enter store ID");
				int sid = shop.nextInt();
				System.out.println("Enter Customer ID");
				int cid = shop.nextInt();
				System.out.println("Enter Product ID");
				int ide = shop.nextInt();
				
				productList[0] = ide;
				store.sell(sid, cid, productList);
			}
		}
		shop.close();
	}
}
