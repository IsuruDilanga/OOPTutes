package Question3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount("Acc001", 2000.00);
        BankAccount ba2 = new BankAccount("Acc002", 2500.00);
        BankAccount ba3 = new BankAccount("Acc003", 1500.00);

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);

        System.out.println("Before sort");
        for (BankAccount b: list){
            System.out.println(b.getBalance());
        }

        System.out.println("--------------------");
        System.out.println("After sort");

        Collections.sort(list);
        for (BankAccount b: list){
            System.out.println(b.getBalance());
        }
    }
}
