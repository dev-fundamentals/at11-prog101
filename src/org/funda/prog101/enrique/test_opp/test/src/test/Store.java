package test;

import java.util.ArrayList;

public class Store {
	private Customer customer;
	private ArrayList<Product> products;
	private ArrayList<Employee> employees;
	private ArrayList<Agreement> agreements;
	
	public Store() {
		products = new ArrayList<>();
		employees = new ArrayList<>();
		agreements = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Product searchProductAviable(String title) {
		
		ArrayList<Product> productsAviable = getAviableProducts();
		
		for (Product product : productsAviable) {
			if (product.title.equals(title)) {
				return product;
			}
		}
		return null;
	}
	
	public Product searchProduct(String title) {
		
		for (Product product : products) {
			if (product.title.equals(title)) {
				return product;
			}
		}
		return null;
	}
	
	public ArrayList<Product> getAviableProducts(){
		ArrayList<Product> productsAviable = new ArrayList<>();
		for (Product product : products) {
			if (product.isAllAviable()) {
				productsAviable.add(product);
			}
		}
		return productsAviable;
	}
	
	public void sellProduct(String title) {
		for (int i = 0; i < products.size(); i++) {
			if(searchProductAviable(title) != null) {
				products.get(i).state.sold();
			}
		}
	}
	
	public void rentProduct(String title) {
		for (int i = 0; i < products.size(); i++) {
			if(searchProductAviable(title) != null) {
				products.get(i).state.rent();;
			}
		}
	}
	
	public void printProducts() {
		for (int i = 0; i < products.size(); i++) {
			products.get(i).print();
		}
	}
}
