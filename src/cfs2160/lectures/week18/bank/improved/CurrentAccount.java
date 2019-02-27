package cfs2160.lectures.week18.bank.improved;

public class CurrentAccount extends BankAccount {

    private boolean hasOverdraft;

    public CurrentAccount (String accountHolder, String accountNumber, boolean hasOverdraft) {
        super (accountHolder, accountNumber);
        this.hasOverdraft = hasOverdraft;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean withdraw (double amount) {
        if (amount > 0) {
            if (this.hasOverdraft || this.getBalance ()  <= amount) {
                this.setBalance (this.getBalance () - amount);
                return true;
            }
        }
        return false;
    }
}
