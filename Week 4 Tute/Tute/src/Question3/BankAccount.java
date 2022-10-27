package Question3;

public class BankAccount implements Comparable<BankAccount>{

    private double balance;
    private String bankAcc;

    public BankAccount(String bankAcc, double balance){
        this.balance = balance;
        this.bankAcc = bankAcc;
    }

    /**
     * comments
     */

    public double getBalance(){return this.balance;}

    @Override
    public int compareTo(BankAccount o) {
        if (this.balance > o.balance) {
            return 1;
        } else if (this.balance < o.balance){
            return -1;
        } else {
            return 0;
        }
    }

}
