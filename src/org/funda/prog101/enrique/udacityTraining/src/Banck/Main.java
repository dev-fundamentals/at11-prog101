package Banck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount checkingAccount = new CheckingAccount();
		SavingAccount savingAccount = new SavingAccount();
		COD cod = new COD();
		
		System.out.println(checkingAccount.account.toString());
		System.out.println(savingAccount.account.toString());
		System.out.println(cod.account.toString());
	}
}
