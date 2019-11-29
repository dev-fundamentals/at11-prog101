package examoop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

	@Test
	void testAddManager() {
		Manager manager1 = new Manager(33, "Janina", 18, "female", 1);
		
		assertEquals(manager1.ci, 33);
		assertEquals(manager1.name, "Janina");
		assertEquals(manager1.age, 18);
		assertEquals(manager1.gender, "female");
		assertEquals(manager1.getId(), 1);
	}
}
