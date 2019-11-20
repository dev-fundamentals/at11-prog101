package testingProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticTest {

	@Test
	public void testMultiply() {
		Arithmetic arithmetic = new Arithmetic();
		assertEquals(4, arithmetic.multiply(2, 2));
		assertEquals(-15, arithmetic.multiply(3, -5));
	}

	@Test
	public void testIsPositive() {
		Arithmetic arithmetic = new Arithmetic();
		assertTrue(arithmetic.isPositive(5));
		assertFalse(arithmetic.isPositive(-5));
		assertFalse(arithmetic.isPositive(0));
	}

}
