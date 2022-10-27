package Question5AndQuestion6;

public class DriverLicense extends Card{

    private int expirationYear;

    public DriverLicense(String n, int expireYear){
        super(n);
        expirationYear = expireYear;
    }

    public String format(){
        String name = super.format();
        return "name: " + name + " expiration year: " + expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
