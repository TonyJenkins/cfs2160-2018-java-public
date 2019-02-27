package cfs2160.lectures.week18.bank.enhanced;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Bank {

    private ArrayList <BankAccount> accounts;

    public Bank () {
        accounts = new ArrayList <> ();
    }

    public void addAccount (BankAccount b) {
        this.accounts.add (b);
    }

    public double totalBalance () {

        double total = 0.0;

        for (BankAccount a : this.accounts) {
            total += a.getBalance ();
        }

        return total;
    }

    public void displayAllAccounts () {
        for (BankAccount b : this.accounts) {
            b.display ();
        }
    }

    public void displayOverdrawnAccounts () {
        for (BankAccount b : this.accounts) {
            if (b.getBalance () < 0.0) {
                b.display ();
            }
        }
    }

    public void displayStudentAccounts () {
        for (BankAccount b : this.accounts) {
            if (b instanceof StudentAccount) {
                b.display ();
            }
        }
    }

    public static void main (String[] args) {

        CurrentAccount c = new CurrentAccount ("Fred", "123", false);
        c.deposit (100);

        DepositAccount d = new DepositAccount ("Jim", "456", 10);
        d.deposit (150);

        StudentAccount s = new StudentAccount ("Alice", "789");
        s.deposit (50);

        Bank theBank = new Bank ();

        theBank.addAccount (c);
        theBank.addAccount (d);
        theBank.addAccount (s);

        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        theBank.displayAllAccounts ();
        System.out.println ();
        System.out.println ("Total Balances: " + gb.format (theBank.totalBalance ()));
        System.out.println ();
        theBank.displayStudentAccounts ();
    }
}
