package objectexersice;

import java.util.ArrayList;

public class Pet {
	private String name;

	private ArrayList<Person> owners;
	public Pet()
	{
		owners = new ArrayList<Person>();
	}

	public void addName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public void addOwner(Person p) {
		owners.add(p);
	}

	public void showOwners() {
		for (int item = 0; item < owners.size(); item++) {
			Person p1 = owners.get(item);
			if (p1 != null) {
				System.out.println(name + " Pertenece a: "+ p1.name);
			}
		}
	}
}
