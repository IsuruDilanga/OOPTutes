package Question5AndQuestion6;

public class CreditCard extends Card{

    private int pinNumber;
    private int number;

    public CreditCard(String n, int pin, int num){
        super(n);
        pinNumber = pin;
        number = num;
    }

    public String format(){
        String name = super.format();
        return "Name: "+ name + " pinNumber: " + pinNumber + " number: " + number;
    }


    @Override
    public boolean isExpired() {
        return false;
    }
}
