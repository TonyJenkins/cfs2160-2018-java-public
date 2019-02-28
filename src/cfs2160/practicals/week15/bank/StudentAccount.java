package cfs2160.practicals.week15.bank;

public class StudentAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    private static final double OVERDRAFT_LIMIT = 500.0;

    public StudentAccount (String accountHolder, String accountNumber, boolean hasOverdraft) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean withdraw (double amount) {
        if (amount > 0) {
            if (this.balance - amount > (-OVERDRAFT_LIMIT)) {
                this.balance -= amount;
                return true;
            }
        }
        return false;
    }

    public boolean deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return amount > 0;
    }

    @Override
    public String toString () {
        return "StudentAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

}
