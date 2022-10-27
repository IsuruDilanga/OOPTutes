package Question4;

import java.util.Comparator;

public class balanceComparator implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if (o1.balance < o2.balance){
            return -1;
        } else if(o1.balance > o2.balance){
            return 1;
        }else {
            return 0;
        }
    }
}
