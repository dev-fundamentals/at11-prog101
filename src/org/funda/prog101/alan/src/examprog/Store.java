package examprog;

import java.util.ArrayList;

public class Store {

	private ArrayList<Product> products; 
	public Store() {}

	public boolean addMovie(Product product) {
		boolean added = false;
		if (product != null) {
			products.add(product);
		}
		return added;
	}

	public boolean SearchProducByName(String string) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
