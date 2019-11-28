package examprog;

import java.util.ArrayList;

public abstract class Product {
	int code;
	String name;
	String type;
	String category;
	String state = "available";
	ArrayList<Customer> listCustomers;
	public Product(int code, String name, String category, String type) {
		this.code = code;
		this.name = name;
		this.category = category;
		this.type = type;
		listCustomers = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public int getCode() {
		return this.code;
	}
	public void setState(String state){
		this.state = state;
	}
	public String getState(){
		return this.state;
	}
	public void addCustomers(Customer customer) {
		listCustomers.add(customer);
	}
	public ArrayList<Customer> getListCustomer(){
		return this.listCustomers;
	}

	public void showCustomers() {
		for (int i = 0; i < listCustomers.size(); i++) {
			Customer custumer = listCustomers.get(i);
			if (custumer != null) {
				System.out.println(name + " is "+ this.state + " to " 
						+ listCustomers.get(i).getName() );
			}
		}
	}




}
