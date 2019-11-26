package examopp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTest {

	@Test
	void test() {
		Person person = new Person(11, "Juan", 25, "male");
		Manager manager =  new Manager(person, 1);
		assertEquals(manager.getId(), 1);
	}

}
