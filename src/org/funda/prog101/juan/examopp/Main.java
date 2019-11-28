package examopp;

import java.time.LocalDate;

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
		
		
	}

}
