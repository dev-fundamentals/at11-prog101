package examopp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testAddNewCustomer() {
		Person person = new Person(11, "Juan", 25, "male");
		Customer customer =  new Customer(person, 1);
		assertEquals(customer.getId(), 1);
	}

}
