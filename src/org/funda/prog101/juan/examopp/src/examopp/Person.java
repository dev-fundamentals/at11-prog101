package examopp;

public class Person {
	private int ci;
	private String name;
	private int age;
	private String gender;
	
	public int getCi(){
		return ci;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
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
