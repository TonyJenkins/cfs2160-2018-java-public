package cfs2160.lectures.week18.bank.enhanced;

import java.text.NumberFormat;
import java.util.Locale;

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

    public boolean deposit (double amount) {
        if (amount > 0) {
            this.setBalance (this.getBalance () + amount);
        }
        return amount > 0;
    }

    public boolean addInterest () {
        if (this.interestRate > 0 && this.getBalance () > 0) {
            double newBalance = this.getBalance () * (1 + (this.interestRate / 100.0));
            this.setBalance (newBalance);
            return true;
        }
        return false;
    }

    public void display () {
        final String formatString = "%20s %12s %12s %10s Interest Rate: %2d%%";
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.println (String.format (formatString, "Deposit Account", this.getAccountNumber (),
                this.getAccountHolder (), gb.format (this.getBalance ()), this.getInterestRate ()));
    }
}
