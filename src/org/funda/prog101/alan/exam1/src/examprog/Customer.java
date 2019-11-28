package examprog;

import java.util.ArrayList;

public class Customer extends Person {
	String nick;
	ArrayList<Product> listProducts;
	public Customer(String name, int ci, String nick) {
		super(name, ci);
		this.nick = nick;
		listProducts = new ArrayList<>();
	}

	public int getCi() {
		return this.ci;
	}
	public String getName() {
		return this.name;
	}
	public String getNick() {
		return this.nick;
	}

	public void addProduct(Product product) {
		listProducts.add(product);
		//product.addCustomers(this);
	}
	public ArrayList<Product> getListProduct(){
		return this.listProducts;
	}
	public void showProducts() {
		System.out.print(name + " bought the following products:");
		for (int i = 0; i < listProducts.size(); i++) {
			Product products = listProducts.get(i);
			if (products != null) {
				System.out.print(" "+products.getName());
			}			
		}
		System.out.println();
	}

}
