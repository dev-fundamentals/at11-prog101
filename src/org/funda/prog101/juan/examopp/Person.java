package examopp;

public abstract class Person {
	protected int ci;
	protected String name;
	protected int age;
	protected String gender;
	
	public Person(int ci, String name, int age, String gender)
	{
		this.ci = ci;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Person(Person person)
	{
		ci = person.ci;
		name = person.name;
		age = person.age;
		gender = person.gender;
	}
}
