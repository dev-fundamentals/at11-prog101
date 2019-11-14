package quiz2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	BankAccount bankAccount;
	@Before
	public void setUp()
	{
		bankAccount = new BankAccount("default");
	}

	@Test
	public void testDeposit() {
		assertEquals(27, bankAccount.balance, 0.1);
		bankAccount.deposit(1);
		assertEquals(28, bankAccount.balance, 0.1);
	}
	
	@Test
	public void testOwner1()
	{
		assertEquals(bankAccount, new BankAccount("default"));
	}
	
	@Test
	public void testOwner2()
	{
		assertTrue(bankAccount == new BankAccount("default"));
	}
	
	@Test
	public void testOwner3()
	{
		assertTrue(bankAccount.equals(new BankAccount("default")));
	}
}
