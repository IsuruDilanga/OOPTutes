package Question1;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("{7}");
        int [] arr = {7};
        loadArray(arr);

        System.out.println("{3,6}");
        int[] arr1 = {3, 6};
        loadArray(arr1);

        System.out.println("{4,6,8}");
        int[] arr2 = {4,6,8};
        loadArray(arr2);

        System.out.println("{1,2,3,4}");
        int[] arr3 = {1,2,3,4};
        loadArray(arr3);

        System.out.println("{8,4,2,0,4}");
        int[] arr4 = {8,4,2,0,4};
        loadArray(arr4);

    }

    public static void loadArray(int[] list){


        for (int i = 1; i < list.length; i++){
            list[i] = list[i] + list[i-1];
        }

        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
