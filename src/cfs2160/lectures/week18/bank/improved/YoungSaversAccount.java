package cfs2160.lectures.week18.bank.improved;

public class YoungSaversAccount extends DepositAccount {

    private final static double MAX_BALANCE = 100.0;

    public YoungSaversAccount (String accountHolder, String accountNumber, int interestRate) {
        super (accountHolder, accountNumber, interestRate);
    }

    @Override
    public boolean deposit (double amount) {
        if (amount > 0 && this.getBalance () + amount <= MAX_BALANCE) {
            this.setBalance (this.getBalance () + amount);
            return true;
        }
        return false;
    }
}
