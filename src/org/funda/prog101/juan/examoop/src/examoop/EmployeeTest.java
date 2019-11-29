package examoop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testAddNewEmpoyee() {
		Employee employee1 = new Employee(44, "Ely", 18, "female", 1);
		
		assertEquals(employee1.ci, 44);
		assertEquals(employee1.name, "Ely");
		assertEquals(employee1.age, 18);
		assertEquals(employee1.gender, "female");
		assertEquals(employee1.getId(), 1);
	}

}
