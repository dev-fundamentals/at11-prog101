package examoop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ActorTest {

	@Test
	void testAddNewActor() {
		Actor actor1 = new Actor(22, "Jhon", 18, "male", "saltos");
		
		assertEquals(actor1.ci, 22);
		assertEquals(actor1.name, "Jhon");
		assertEquals(actor1.age, 18);
		assertEquals(actor1.gender, "male");
		assertEquals(actor1.getSpeciality(), "saltos");
	}

}
