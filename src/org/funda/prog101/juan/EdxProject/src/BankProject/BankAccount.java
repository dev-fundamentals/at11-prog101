package BankProject;

public class BankAccount {
	 double balance;
	 Customer customer;
	 static int counter = 10000;
	 int accountNumber;
	 
	 public BankAccount(String name, int age)
	 {
		 balance = 0;
		 customer = new Customer(name, age);
		 counter++;
		 accountNumber = counter;
	 }
	 
	 public static void main(String[] args) {
		BankAccount a1 = new BankAccount("x", 35);
		BankAccount a2 = new BankAccount("abc", 16);
		System.out.println("person " + a1.customer.getName() + " " + a1.accountNumber);
		System.out.println("person " + a2.customer.getName() + " " + a2.accountNumber);
	}
}
