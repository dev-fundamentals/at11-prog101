package examopp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testAddPerson() {
		Person person = new Person(11, "Juan", 25, "male");
		assertEquals(person.getCi(), 11);
		assertEquals(person.getName(), "Juan");
		assertEquals(person.getAge(), 25);
		assertEquals(person.getGender(), "male");
	}
	
}
