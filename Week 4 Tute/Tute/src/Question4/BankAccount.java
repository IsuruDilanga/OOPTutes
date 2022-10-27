package Question4;

import java.util.Comparator;

public class BankAccount {

    protected double balance;
    private String bankAcc;

    public BankAccount(String bankAcc, double balance){
        this.bankAcc = bankAcc;
        this.balance = balance;
    }

    public double getBalance(){return this.balance;}

}
