package examopp;

public class Manager extends Person{
	private int id;
	
	public int getId() {
		return id;
	}
	
	public Manager(int ci, String name, int age, String gender, int id)
	{
		super(ci, name, age, gender);
		this.id = id;
	}
}
