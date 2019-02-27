package cfs2160.lectures.week18.bank.golden;

public class GoldCurrentAccount extends CurrentAccount implements GoldenAccount {

    public GoldCurrentAccount (String accountHolder, String accountNumber, boolean hasOverdraft) {
        super (accountHolder, accountNumber, hasOverdraft);
    }

    @Override
    public boolean takeMonthlyFee () {

        if (this.getBalance () >= MONTHLY_FEE) {
            this.withdraw (MONTHLY_FEE);
        }

        return this.getBalance () >= MONTHLY_FEE;
    }

    @Override
    public void addMonthlyBonus () {

        // TODO: Add Percent of current balance, if balance in credit.
    }
}
