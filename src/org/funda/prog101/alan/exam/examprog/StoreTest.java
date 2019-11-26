package examprog;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class StoreTest {
	@Test
	public void Store_addProduct_added() {
		Product product = new Product(1,"armagedon","");
		Store store = new Store();
		boolean expected = true;
		boolean actual = store.addMovie(product);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void Store_SearchProductbyName_added() {
		
		Store store = new Store();
		boolean expected = true;
		boolean actual = store.SearchProducByName("armagedon");
		
		assertEquals(expected,actual);
	}

	
}
	
	
