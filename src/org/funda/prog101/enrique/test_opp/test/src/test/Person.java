package test;

public abstract class Person {
	
	protected String firstName;
	protected String firstLastName;
	
	public void printCompleteName() {
		System.out.println(firstLastName + " " + firstLastName);
	}

}
