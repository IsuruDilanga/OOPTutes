package Question5AndQuestion6;

public class Passport extends Card{

    private String birthLocation;
    private int expirationYear;

    public Passport(String n, String birthLocation, int expirationYear){
        super(n);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    public String format(){
        String name = super.format();
        return "Birth Location: " + this.birthLocation + " name: " + name + " expiration year: " + this.expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
