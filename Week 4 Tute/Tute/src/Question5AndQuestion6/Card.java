package Question5AndQuestion6;

public abstract class Card {

    private String name;

    public Card(){
        name = "";
    }

    public Card(String n){
        this.name = n;
    }

    public String getName(){return this.name;}

    public abstract boolean isExpired();

    public String format(){
        return "Card holder: " + this.name;
    }
}
