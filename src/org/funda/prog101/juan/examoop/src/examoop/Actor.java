package examoop;

public class Actor extends Person{
	private String speciality;
	
	public String getSpeciality() {
		return speciality;
	}
	
	public Actor(int ci, String name, int age, String gender, String speciality)
	{
		super(ci, name, age, gender);
		this.speciality = speciality;
	}
	
}
