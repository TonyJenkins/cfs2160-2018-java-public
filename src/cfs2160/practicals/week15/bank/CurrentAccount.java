package cfs2160.practicals.week15.bank;

public class CurrentAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean hasOverdraft;

    public CurrentAccount (String accountHolder, String accountNumber, boolean hasOverdraft) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
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

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean withdraw (double amount) {
        if (amount > 0) {
            if (this.hasOverdraft || this.balance >= amount) {
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
        return "CurrentAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }

    public static void main (String args[]) {

        CurrentAccount c = new CurrentAccount ("John Smith", "8271822", false);

        c.deposit (100);
        System.out.println ("c = " + c);

        c.withdraw (110);   // Should fail.
        System.out.println ("c = " + c);

        c.withdraw (50);    // Should succeed.
        System.out.println ("c = " + c);

    }

}
