package examopp;

import java.util.ArrayList;

public class Customer extends Person{
	private int id;
	ArrayList<Product> products;
	
	public int getId() {
		return id;
	}
	
	public Customer(Person person, int id)
	{
		super(person);
		this.id = id;
	}
}
