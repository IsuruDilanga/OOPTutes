package Question4;

import java.util.ArrayList;

public class ContainerTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(3.4);
        list.add(4);

        Book1 myBook = new Book1();
        list.add(myBook);

        double d;
        d = (double) list.get(0); // Problematic line

        Integer d2 = (Integer) list.get(1); // Problematic line
        Integer b3 = (Integer) list.get(1);
//        Book1 b3 = (Book1) list.get(1); // Problematic line
        Book1 b2 = (Book1) list.get(2); // Problematic line
    }
}
