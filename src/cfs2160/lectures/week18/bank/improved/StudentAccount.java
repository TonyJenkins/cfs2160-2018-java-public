package cfs2160.lectures.week18.bank.improved;

public class StudentAccount extends CurrentAccount {

    private static final double OVERDRAFT_LIMIT = 500.0;

    public StudentAccount (String accountHolder, String accountNumber) {
        super (accountHolder, accountNumber, true);
    }

    @Override
    public boolean withdraw (double amount) {
        if (amount > 0) {
            if (this.getBalance () - amount > (OVERDRAFT_LIMIT * -1)) {
                this.setBalance (this.getBalance () - amount);
                return true;
            }
        }
        return false;
    }
}
