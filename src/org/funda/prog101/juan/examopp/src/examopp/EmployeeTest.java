package examopp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testAddNewEmpoyee() {
		Person person = new Person(11, "Juan", 25, "male");
		Employee employee =  new Employee(person, 1);
		assertEquals(employee.getId(), 1);
	}

}
