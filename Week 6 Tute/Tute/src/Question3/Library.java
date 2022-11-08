package Question3;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book = new ArrayList<>();

    public void populate(){
        for (int i = 0; i < 4; i ++){
            Book b = new Book();
            b.author = "Author" + i;
            b.title = "Title" + i;

            book.add(b);
        }
    }

    public void displayAllBooks(){
        for (int i = 0; i < book.size(); i++){
            System.out.println("Author name: " + book.get(i).author + " Title: " + book.get(i).title);
        }
    }
}
