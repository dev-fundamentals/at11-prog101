package examopp;

import java.util.*;
import java.util.ArrayList;


import javax.swing.text.html.HTMLDocument.Iterator;

public class Store {
	private int id;
	private ArrayList<Employee> employees;
	private Manager manager;
	private ArrayList<Product> products;
	private ArrayList<Customer> customers;
	ArrayList<Product> prodList = new ArrayList<Product>();
	
	public int getId() {
		return id;
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	public Store() 
	{}
	
	public Store(int id, Manager manager)
	{
		this.id = id;
		employees = new ArrayList<Employee>();
		manager = new Manager(manager.ci, manager.name, manager.age,
								manager.gender, manager.getId());
		products = new ArrayList<Product>();
		customers = new ArrayList<Customer>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void addProduct(Product product) {
		if (product instanceof Movie) {
			products.add((Movie)product);
		}
		if (product instanceof TvShow) {
			products.add((TvShow)product);
		}
		if (product instanceof VideoGame) {
			products.add((VideoGame)product);
		}
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public Product findProduct(int productId) {
		Product product = products.stream().
				filter(p -> p.id == productId).
				findAny().orElse(null);
		return product;
	}
	
	public ArrayList<Product> findProducts(int[] productsFind) {
		
		for (int item = 0; item < productsFind.length; item++) {
			Product product = findProduct(productsFind[item]);
			if (product != null) {
				prodList.add(product);
			}
		}
 
		return prodList;
	}
	
	
	public void rent(int storeId, int customerId, ConditionType type, int [] prodList) {
		Contract contract = new Contract(storeId, customerId, type);
		for (int item = 0; item < prodList.length; item++) {
			Product findProduct = findProduct(prodList[item]);
			if (findProduct != null && findProduct.status == ProductStatus.InStoreAvailable) {
				findProduct.status = ProductStatus.Customer;
				contract.addProduct(findProduct);
			}
		}
		System.out.println("Total price for rented " + contract.getTotalPrice());
	}
	
	public void sell(int storeId, int customerId, ArrayList<Movie> movieList) {
		Sell sell = new Sell(storeId, customerId);
		for (Movie movie : movieList) {
			Product findMovie = findProduct(movie.id);
			if (findMovie != null) {
				findMovie.status = ProductStatus.Customer;
				sell.addMovie((Movie)findMovie);
			}
		}
		System.out.println("Total price for sell " + sell.getTotalPrice());
	}
}