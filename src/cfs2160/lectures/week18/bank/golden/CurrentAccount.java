package cfs2160.lectures.week18.bank.golden;

import java.text.NumberFormat;
import java.util.Locale;

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
            if (this.hasOverdraft || this.getBalance () <= amount) {
                this.setBalance (this.getBalance () - amount);
                return true;
            }
        }
        return false;
    }

    public void display () {
        final String formatString = "%20s %12s %12s %10s ";
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.print (String.format (formatString, "Current Account", this.getAccountNumber (),
                this.getAccountHolder (), gb.format (this.getBalance ())));

        if (this.hasOverdraft) {
            System.out.println ("Has Overdraft");
        }
        else {
            System.out.println ("No Overdraft");
        }
    }
}
