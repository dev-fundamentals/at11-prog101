package examopp;

import java.util.ArrayList;

public class Customer extends Person{
	private int id;
	
	public int getId() {
		return id;
	}
	
	public Customer(int ci, String name, int age, String gender, int id)
	{
		super(ci, name, age, gender);
		this.id = id;
	}
}
