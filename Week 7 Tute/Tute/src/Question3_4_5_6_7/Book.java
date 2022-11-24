package Question3_4_5_6_7;

public class Book implements Comparable<Book>{

    private String title;
    private double price;
    private int year;
    private String name;

    public Book(String title, double price, int year, String name){
        this.title = title;
        this.price = price;
        this.year = year;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String p = "Title: " + title;
        p = p + "\nprice: " + price;
        p = p + "\nYear: " + year;
        p = p + "\nName of the author: " + name;
        return p;

    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.year, o.year);
//        if(this.year > o.year){
//            return 1;
//          } else if (this.year < o.year){
//              return -1;
//          } else {
//              return 0;
//          }
//
//
//

    }
}
