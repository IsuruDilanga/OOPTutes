package UsPostalService;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Zip Code: ");

        String num1 = input.next();

        if (num1.length() == 5) {
            String[] split = num1.split("");
            System.out.println(Arrays.toString(split));

            for (int i = 0; i < split.length; i++) {
                switch (split[i]) {
                    case "0" -> System.out.print("||:::");
                    case "1" -> System.out.print(":::||");
                    case "2" -> System.out.print("::|:|");
                    case "3" -> System.out.print("::||:");
                    case "4" -> System.out.print(":|::|");
                    case "5" -> System.out.print(":|:|:");
                    case "6" -> System.out.print(":||::");
                    case "7" -> System.out.print("|:::|");
                    case "8" -> System.out.print("|::|:");
                    case "9" -> System.out.print("|:|::");
                }
            }

        } else {
            System.out.println("Out of range");
        }

        System.out.println();
        System.out.println("---------------------------------");

        System.out.println("Enter bar code: ");
        String barCode = input.next();
        String[] barArray = {barCode};

//        //if (barCode.length() == 10){
//            int splitSize = 5;
//            String [] barArray1 = Arrays.copyOfRange(barArray, 0, splitSize);
////            String [] barArray2 = Arrays.copyOfRange(barArray, splitSize, barArray.length);
//            System.out.println(Arrays.toString(barArray1));
////            System.out.println(Arrays.toString(barArray2));
//        //}

        int numberOfArrays = barArray.length / 5;

        int start = 0;
        int end = 0;

//        String [] list1 = new String[5];
        String[] list1 = new String[0];
        for (int i = 0; i < numberOfArrays; i++) {
            end += 5;
            list1 = Arrays.copyOfRange(barArray, start, end);
            start = end;
        }

        System.out.println(Arrays.toString(list1));
    }
}
