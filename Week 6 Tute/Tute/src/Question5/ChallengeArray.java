package Question5;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length size: ");
        int arraySize = input.nextInt();

        int[] arr = new int[arraySize];

        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter " + i + " index value: ");
            arr[i] = input.nextInt();
        }

        printTwoElements(arr, arr.length);
    }

    public static void printTwoElements(int[] arr, int arraySize){
        System.out.println("Repeat element is: ");

        for (int i = 0; i < arraySize; i++){
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0){
                arr[abs_val - 1] = -arr[abs_val - 1];
            } else {
                System.out.println(abs_val);
            }
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Missing Element is: ");
        for (int i = 0; i < arraySize; i++){
            if (arr[i]>0){
                System.out.println(i+1);
            }
        }
    }
}
