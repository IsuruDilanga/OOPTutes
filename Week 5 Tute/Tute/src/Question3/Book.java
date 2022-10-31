package Question3;

public class Book {

    private int pages;

    Book(int pages){
        this.pages = pages;
    }

    @Override
    public String toString(){
        return ""+pages;
    }
}
