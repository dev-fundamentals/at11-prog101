package examopp;

public class Manager extends Person{
	private int id;
	
	public int getId() {
		return id;
	}
	
	public Manager(Person person, int id)
	{
		super(person);
		this.id = id;
	}
}
