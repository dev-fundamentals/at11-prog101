package quiz2;

public class BankAccount {
	double balance;
	String accountOwner;
	
	public BankAccount(String owner)
	{
		this.balance = 27;
		this.accountOwner = owner;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	@Override
	public boolean equals(Object inputValue)
	{
		return (((BankAccount) inputValue).accountOwner).equals(accountOwner);
	}
	
	public void withDraw(double inputValue)
	{
		balance -= inputValue;
		
	}
}
