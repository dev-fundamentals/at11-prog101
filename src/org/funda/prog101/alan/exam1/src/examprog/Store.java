package examprog;

import java.util.ArrayList;

public class Store {
	//private boolean available;
	private ArrayList<Product> products; 
	private ArrayList<Customer> customers;
	public Store() {
		products = new ArrayList<>();
		customers = new ArrayList<>();
	}

	public boolean addProduct(Product product) {
		boolean added = false;
		if (product != null) {
			if (searchProduct(product.getCode()) == null) {
				products.add(product);
				added = true;
			}
		}
		else {
			System.out.println("this code already exist");
		}

		return added;
	}

	public Product searchProduct(int id) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getCode() == id) {
				return products.get(i);
			}
		}
		return null;
	}

	Product searchProduct(String name) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equals(name)) {
				return products.get(i);
			}
		}
		return null;
	}

	public String rentAProduct(Product product, Customer customer) {
		product.setState("with costumer");
		product.addCustomers(customer);
		customer.addProduct(product);

		/*Product product = searchProduct(name);
		String state = "don't exist";
		if (product != null) {
			product.setState("with costumer");
			state = product.getState();
		}*/
		return product.getState();
	}

	public String SellAProduct(Product product, Customer customer) {
		product.setState("Sold");
		product.addCustomers(customer);
		customer.addProduct(product);
		/*String state = "failed";
		if (product != null) {
			product.setState("Sold");

			state = product.getState();
		}*/
		return product.getState();
	}

	public boolean addCustomer(Customer customer) {
		boolean added = false;
		if (customer != null) {
			if (searchCustomer(customer.getCi()) == null) {
				customers.add(customer);
				added = true;
			}
		}
		else {
			System.out.println("this Customer already exist");
		}

		return added;
	}

	public Customer searchCustomer(int ci) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getCi() == ci) {
				return customers.get(i);
			}
		}
		return null;
	}
	public Customer searchCustomer(String name) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getName().equals(name)) {
				return customers.get(i);
			}
		}
		return null;
	}
	public void showProducts() {
		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			if (product != null) {
				System.out.println("Code: "+ product.code + "| Name: " + product.getName()+
						"| State: "+ product.getState() + "| Type: "+ product.getType());
			}
		}
	}

	public void showCustomers() {
		for (int i = 0; i < customers.size(); i++) {
			Customer person = customers.get(i);
			if (person != null) {
				System.out.println("Name: "+ person.getName() + "| Ci: " + person.getCi()+
						"| Nick: "+ person.getNick());
			}
		}

	}


}
