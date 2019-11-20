package com.company;

public class BankAccount {
    //Fields
    private String account;
    private String balance;

    //Constructor
    public BankAccount()
    {}
    public BankAccount(String account, String balance)
    {
        this.account = account;
        this.balance = balance;
    }

    public void setAccount(String accountInput)
    {
        account = accountInput;
    }

    public void setBalance(String balanceInput)
    {
        balance = balanceInput;
    }

    public String getAccount()
    {
        return account;
    }

    public String getBalance()
    {
        return balance;
    }
}
