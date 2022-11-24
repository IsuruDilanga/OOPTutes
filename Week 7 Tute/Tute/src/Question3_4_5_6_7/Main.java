package Question3_4_5_6_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 3 ; i++){
            System.out.println("Enter book title: ");
            String title = input.next();

            System.out.println("Enter book price: ");
            double price = input.nextDouble();

            System.out.println("Enter publish year: ");
            int year = input.nextInt();

            System.out.println("Enter Author name: ");
            String author = input.next();

            bookList.add(i, new Book(title, price, year, author));
        }

        HashMap<Book, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < bookList.size(); i++){
            System.out.println("Please, enter the number of the shelf where is placed the book: " +
                    bookList.get(i).getTitle());
            int numShelf = input.nextInt();
            hashMap.put(bookList.get(i), numShelf);
        }

        System.out.println("Insert the number of the shelf");
        int selectedShelf = input.nextInt();
        System.out.println("The book in shelf " + selectedShelf + " are: ");

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();

            if (selectedShelf == (int) entry.getValue()){
                System.out.println(((Book)entry.getKey()).getTitle());
            }
        }

//        System.out.println("Before sorting: ");
//        for (Book b: bookList){
//            System.out.println(b.toString());
//        }
//
//        System.out.println("---------------------------");
//        System.out.println("After sorting");
//
//        Collections.sort(bookList);
//        for (Book b: bookList){
//            System.out.println(b.toString());
//        }
    }
}
