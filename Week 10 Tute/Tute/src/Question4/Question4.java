package Question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        do {
            try{
                System.out.println("Please enter an integer");
                value = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Input valid number");
            }
            input.nextLine();
        }while (value <= 0);


        System.out.println("Value: " + value);
    }
}
