package test;

public class Employee extends Person{
	
	protected String secondName;
	protected String secondLastName;
	protected String type;
	
	public Employee(String firstName, String secondName, String firstLastName, String secondLastName, String type) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.firstLastName = firstLastName;
		this.secondLastName = secondLastName;
		this.type = type;
	}

}
