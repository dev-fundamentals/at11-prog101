package examtest;

public class Person {
	private int id;
	private String name;
	private int age;
	
	public Person()
	{}
	
	public Person(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Person jo = new Person(1, "Jose", 22);
		Person josie = new Person(1, "Jose", 22);
		
		if (jo.equals(josie))
			System.out.println("They are equals");
		else
			System.out.println("They are not equals");
	}

}
