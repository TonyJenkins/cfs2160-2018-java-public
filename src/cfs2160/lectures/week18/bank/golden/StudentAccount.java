package cfs2160.lectures.week18.bank.golden;

import java.text.NumberFormat;
import java.util.Locale;

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

    public void display () {
        final String formatString = "%20s %12s %12s %10s";
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        System.out.println (String.format (formatString, "Student Account", this.getAccountNumber (),
                                                         this.getAccountHolder (), gb.format (this.getBalance ())));
    }
}
