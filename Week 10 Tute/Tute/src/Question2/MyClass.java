package Question2;

public class MyClass {

    public static void main(String[] args) {

        int myArray[] = new int[5];
        try{

            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The element " + myArray.length + " does not exist!");
        }
    }
}
