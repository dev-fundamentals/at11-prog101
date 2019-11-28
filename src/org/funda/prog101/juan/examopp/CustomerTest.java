package examopp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testAddNewCustomer() {
		Customer customer =  new Customer(11, "Juan", 25, "male", 1);
		
		assertEquals(customer.ci, 11);
		assertEquals(customer.name, "Juan");
		assertEquals(customer.age, 25);
		assertEquals(customer.gender, "male");
		assertEquals(customer.getId(), 1);
	}

}
