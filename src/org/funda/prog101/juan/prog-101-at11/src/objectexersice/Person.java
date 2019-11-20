package objectexersice;

import java.util.ArrayList;

public class Person {
	String name;
	ArrayList<Pet> mascotas;

	public Person()
	{}

	public Person(String name, ArrayList<Pet> mascotas) {
		this.name = name;
		if (mascotas != null) {
			this.mascotas = mascotas;
			for (int item = 0; item < this.mascotas.size(); item++) {
				this.mascotas.get(item).addOwner(this);
				}
		}else
		{
	 		this.mascotas = mascotas;
	 		mascotas = new ArrayList<Pet>();
		}
	}

	public String name() 
	{ 
		return "";
	}

	public void addPet(Pet pet) {
		mascotas.add(pet);
		pet.addOwner(this);
	}

	public void showPets() {
		System.out.print(name + " tiene las siguientes mascotas: ");
		for (int i = 0; i < mascotas.size(); i++) {
	 		Pet m1 = mascotas.get(i);
	 		if (m1 != null) {
	 			System.out.println(m1);
	 		}
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
