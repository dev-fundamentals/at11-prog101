package examprog;
import static org.junit.Assert.*;


import org.junit.Test;

public class StoreTest {
	@Test
	public void Store_addProduct_True() {
		//Product product;
		Store store = new Store();
		boolean expected = true;
		boolean actual1 = store.addProduct(new Movie(1,"armagedon","action",1998));
		boolean actual2 = store.addProduct(new Movie(2,"avengers1","action",2012));
		boolean actual3 = store.addProduct(new Movie(3,"lion king","animation",2019));
		boolean actual4 = store.addProduct(new VideoGame(4,"starcraft","Strategy","blizzard"));

		store.showProducts();
		assertEquals(expected,actual1);
		assertEquals(expected,actual2);
		assertEquals(expected,actual3);
		assertEquals(expected,actual4);
	}

	@Test
	public void Store_SearchMoviebyName_Available() {
		Store store = new Store();
		String expected = "available";

		store.addProduct(new Movie(1,"armagedon","action",1998));
		store.addProduct(new Movie(2,"avengers1","action",2012));
		store.addProduct(new Movie(3,"lion king","animation",2019));
		store.addProduct(new VideoGame(4,"starcraft","Strategy","blizzard"));
		Product actual = store.searchProduct("lion king");
		assertEquals(expected,actual.getState());

	}
	@Test
	public void Store_rentalProduct_Retailed() {
		Store store = new Store();
		String expected = "with costumer";
		store.addProduct(new Movie(1,"armagedon","action",1998));
		store.addProduct(new Movie(2,"avengers1","action",2012));
		store.addProduct(new Movie(3,"lion king","animation",2019));
		store.addProduct(new VideoGame(4,"starcraft","Strategy","blizzard"));
		store.addCustomer(new Customer("laura",82346, "lau"));
		store.addCustomer(new Customer("alvaro",1236, "alva"));
		store.addCustomer(new Customer("marc",5556, "marc"));

		Product product = store.searchProduct(1);
		Customer customer = store.searchCustomer(5556);
		String actual = store.rentAProduct(product,customer);
		Customer customer2 = store.searchCustomer(82346);
		store.rentAProduct(product,customer2);
		Customer customer3 = store.searchCustomer(1236);
		store.rentAProduct(product,customer3);
		product.showCustomers();

		assertEquals(expected,actual);
	}

	@Test
	public void Store_sellProduct_sold() {
		Store store = new Store();
		String expected = "Sold";
		store.addProduct(new Movie(1,"armagedon","action",1998));
		store.addProduct(new Movie(2,"avengers1","action",2012));
		store.addProduct(new Movie(3,"lion king","animation",2019));
		store.addProduct(new VideoGame(4,"starcraft","Strategy","blizzard"));
		store.addCustomer(new Customer("laura",82346, "lau"));
		Product product = store.searchProduct(3);
		Customer customer = store.searchCustomer(82346);
		String actual = store.SellAProduct(product,customer);
		Product product1 = store.searchProduct(2);
		store.SellAProduct(product1,customer);
		Product product2 = store.searchProduct(4);

		store.SellAProduct(product2,customer);
		product.showCustomers();
		customer.showProducts();
		assertEquals(expected,actual);
	}

	@Test
	public void Store_addClient_true() {
		Store store = new Store();
		boolean expected = true;
		store.addCustomer(new Customer("laura",82346, "lau"));
		boolean actual = store.addCustomer(new Customer("alejandro",13456, "ale"));

		assertEquals(expected,actual);
	}

}


