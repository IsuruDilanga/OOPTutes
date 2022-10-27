package Question4;

import Question3.BankAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {

        Question4.BankAccount ba1 = new Question4.BankAccount("Acc001", 3000.00);
        Question4.BankAccount ba2 = new Question4.BankAccount("Acc002", 3500.00);
        Question4.BankAccount ba3 = new Question4.BankAccount("Acc003", 2500.00);

        ArrayList<Question4.BankAccount> list = new ArrayList<Question4.BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);

        System.out.println("Before sort");
        for (Question4.BankAccount b: list){
            System.out.println(b.getBalance());
        }

        System.out.println("--------------------");
        System.out.println("After sort");

        Collections.sort(list, new balanceComparator());
        for (Question4.BankAccount b: list){
            System.out.println(b.getBalance());
        }
    }
}
