package objectexersice;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.addName("Super");
		Pet pet2 = new Pet();
		pet2.addName("Luna");
		Pet pet3 = new Pet();
		pet3.addName("Vegeta");

		ArrayList<Pet> petsGroup1 = new ArrayList<Pet>();
		petsGroup1.add(pet1);
		petsGroup1.add(pet2);

		Person juan = new Person("Juan", petsGroup1);
		ArrayList<Pet> petsGroup2 = new ArrayList<Pet>();
		petsGroup2.add(pet2);
		petsGroup2.add(pet3);

		Person alan = new Person("Alan", petsGroup2);

		juan.showPets();
		alan.showPets();

		pet1.showOwners();
		pet2.showOwners();
		pet3.showOwners();
	}

}
