package Question2;

public class ArrayManipulator {
    public static void main(String[] args) {

        int[] a = new int[5];
        for (int i = 0; i < a.length; i++){
            a[i] = i+2;     //a[0]=2, a[1]=3, a[2]=4, a[3]=5, a[4]=6
        }

        int[] b = new int[10];
        for (int i = (b.length-1); i >= 0; i--){
            b[i] = i - 2;   //b[9]=7, b[8]=6, b[7]=5, b[6]=4, b[5]=3, b[4]=2, b[3]=1, b[2]=0, b[1]=-1, b[0]=-2
        }

        int [][] c = new int[2][];
        c[0] = b;
        c[1] = a;

        a = b;

        System.out.print("a contains: ");
        for (int e : a)
            System.out.print(e + " ");
        System.out.println();

        System.out.print("b contains: ");
        for (int e : b)
            System.out.print(e + " ");
        System.out.println();

        System.out.println("c contains: ");
        for (int[] r : c) {
            for (int e : r)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}
