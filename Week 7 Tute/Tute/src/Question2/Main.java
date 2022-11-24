package Question2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(15);
        listDemo(arr);

        System.out.println("---------------------------");
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(8);
        arr1.add(2);
        arr1.add(8);
        arr1.add(7);
        arr1.add(4);
        listDemo(arr1);

        System.out.println("---------------------------");
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(-1);
        arr3.add(3);
        arr3.add(28);
        arr3.add(17);
        arr3.add(9);
        arr3.add(30);
        listDemo(arr3);
    }

    public static void listDemo(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){ //3
            int element = list.get(i); //i=0, e= 5
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }
}
