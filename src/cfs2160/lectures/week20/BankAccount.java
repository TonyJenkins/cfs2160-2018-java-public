package bank;

import java.util.Random;

public class BankAccount {

    private static final int ACCOUNT_NUMBER_LENGTH = 8;

    private String accountNumber;
    private String accountHolder;
    private int balance;

    public BankAccount (String accountHolder) {
        this.accountNumber = generateAccountNumber ();
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public BankAccount (String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance () {
        return balance;
    }

    public void setBalance (int balance) {
        this.balance = balance;
    }

    public String generateAccountNumber () {

        Random rg = new Random ();
        StringBuilder randomAccountNumber = new StringBuilder (8);

        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH; i ++) {
            randomAccountNumber.append (rg.nextInt (10));
        }

        return randomAccountNumber.toString ();
    }

    public void deposit (int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else {
            throw new IllegalArgumentException ("Invalid Amount Deposited");
        }
    }

    public void withdraw (int amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
        }
        else {
            throw new IllegalArgumentException ("Invalid Withdraw Amount");
        }
    }

    @Override
    public String toString () {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
