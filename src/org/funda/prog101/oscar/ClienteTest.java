package exam;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.Calculator;

public class ClienteTest {

	@Test
	public void add_AddPersonalInfo() {
		Cliente c = new Cliente(12345,"PEres","juan",1);
		String actual = Cliente.add(c);
		String expected = "0";

		assertEquals(actual, expected);	
	}

}
