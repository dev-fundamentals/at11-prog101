package examopp;

import java.util.ArrayList;

public class Employee extends Person {
	private int id;
	
	public int getId() {
		return id;
	}
	
	public Employee(Person person, int id)
	{
		super(person);
		this.id = id;
	}
}
