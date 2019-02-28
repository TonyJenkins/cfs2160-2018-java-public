package cfs2160.practicals.week15.bank;

public class DepositAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;
    private int interestRate;

    public DepositAccount (String accountHolder, String accountNumber, boolean hasOverdraft) {
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

    public int getInterestRate () {
        return interestRate;
    }

    public void setInterestRate (int interestRate) {
        this.interestRate = interestRate;
    }

    public boolean withdraw (double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
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

    public boolean addInterest () {
        if (this.interestRate > 0 && this.balance > 0) {
            this.balance *= 1 + (this.interestRate / 100.0);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "DepositAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

}
