package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccount("464656");
        checkingAccount.setBalance("2123123");
        System.out.println(checkingAccount.getAccount());
        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccount("7878979");
        savingsAccount.setBalance("336636336");
        System.out.println(savingsAccount.getAccount());
        System.out.println(savingsAccount.getBalance());

        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit();
        certificateOfDeposit.setAccount("0020022");
        certificateOfDeposit.setBalance("46611113");
        System.out.println(certificateOfDeposit.getAccount());
        System.out.println(certificateOfDeposit.getBalance());
    }
}
