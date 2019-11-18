package brillantproject;

public class Brilliant {
	static int enigma = 0;
	String name;
	int age;
	
	Brilliant(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void doMagic(int trick)
	{
		enigma = enigma + trick;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brilliant sherry = new Brilliant("you", 24);
		System.out.println(sherry.enigma);
		sherry.doMagic(679);
		Brilliant suki = new Brilliant("anomymous", 24);
		System.out.println(suki.enigma);
	}

}
