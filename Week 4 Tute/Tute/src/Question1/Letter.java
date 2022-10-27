package Question1;

public class Letter implements Printable{

    private String text;

    public Letter(String text){
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Field text: " + this.text);
    }
}
