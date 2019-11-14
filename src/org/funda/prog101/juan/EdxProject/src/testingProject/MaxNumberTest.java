package testingProject;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MaxNumberTest {
	
	MaxNumber maxNumber = new MaxNumber();
	@Test
	public void testMax() {
		int expected = 7;
		assertEquals(expected, maxNumber.max(3, 7));
		assertEquals(3, maxNumber.max(3, -7));
	}

}
