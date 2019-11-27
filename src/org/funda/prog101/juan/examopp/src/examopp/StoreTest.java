package examopp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StoreTest {

	@Test
	void testInitStore() {
		Person employee1 = new Person(11, "Juan", 25, "male");
		Person employee2 = new Person(12, "Alicia", 23, "female");
		Person employee3 = new Person(13, "Jose", 22, "male");
		
		Person manager = new Person(3, "Pepe", 20, "female");
		
		
		
		Store store = new Store(1);
	}

}
