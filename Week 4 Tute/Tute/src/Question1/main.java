package Question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String[] grades1 = {"A", "B", "C", "D", "E"};
        Student s1 = new Student("Kamal", grades1);
        s1.print();

        int a = 5;
        int b = 7;
        String[] arr = {String.valueOf(a)+String.valueOf(b)};
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<String>();
        list.add(String.valueOf(4)+String.valueOf(5));
        list.add(String.valueOf(6)+String.valueOf(7));
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
