package examoop;

import java.util.ArrayList;

public class Employee extends Person {
	private int id;
	
	public int getId() {
		return id;
	}
	
	public Employee(int ci, String name, int age, String gender, int id)
	{
		super(ci, name, age, gender);
		this.id = id;
	}
}
