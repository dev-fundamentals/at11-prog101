package examopp;

import java.util.ArrayList;

public class Store {
	private int id;
	ArrayList<Employee> employees;
	Manager manager;
	ArrayList<Product> products;
	
	public Store(int id) {
		this.id = id;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
}
