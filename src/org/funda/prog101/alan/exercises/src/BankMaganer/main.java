package BankMaganer;

public class main {

	public static void main(String[] args) {
		CertificateOfDeposit cod = new CertificateOfDeposit();
		CheckingAccount ca = new CheckingAccount();
		SavingsAccount sa = new SavingsAccount();
		cod.account = "123-15";
		cod.balance = 1.54;
		
		ca.account = "1654-564";
		ca.balance = 564.46;
		
		sa.account = "6546-24";
		sa.balance = 7774.44;
		
		System.out.println("COD: " + cod.account + " and its balance is: "+ cod.balance);
		System.out.println("CA: " + ca.account + " and its balance is: "+ ca.balance);
		System.out.println("SA: " + sa.account + " and its balance is: "+ sa.balance);
	}

}
