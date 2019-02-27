package cfs2160.lectures.week18.bank.improved;

public class DepositAccount extends BankAccount {

    private int interestRate;

    public DepositAccount (String accountHolder, String accountNumber, int interestRate) {
        super (accountHolder, accountNumber);
        this.interestRate = interestRate;
    }

    public int getInterestRate () {
        return interestRate;
    }

    public void setInterestRate (int interestRate) {
        this.interestRate = interestRate;
    }

    public boolean addInterest () {
        if (this.interestRate > 0 && this.getBalance () > 0) {
            double newBalance = this.getBalance () * (1 + (this.interestRate / 100.0));
            this.setBalance (newBalance);
            return true;
        }
        return false;
    }
}
