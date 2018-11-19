package cfs2160.lectures.week07;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
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

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw (double amount) {
        this.balance -= amount;
    }

    public void addInterest (int interestRate) {
        this.balance += this.balance * (interestRate / 100.0);
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("BankAccount{");
        sb.append ("accountNumber='").append (accountNumber).append ('\'');
        sb.append (", accountHolder='").append (accountHolder).append ('\'');
        sb.append (", balance=").append (balance);
        sb.append (", hasOverdraft=").append (hasOverdraft);
        sb.append ('}');
        return sb.toString ();
    }

    public static void main (String[] args) {

        BankAccount b = new BankAccount ("78325616", "Richard Branson", false);
    }
}
