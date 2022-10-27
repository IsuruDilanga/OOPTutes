package Question5AndQuestion6;

public class main {

    public static void main(String[] args) {

        DriverLicense d1 = new DriverLicense("Smith John", 2025);
        Passport p1 = new Passport("Bill gates", "London", 2030);
        CreditCard c1 = new CreditCard("mathuw ross", 654321, 222333111);

        System.out.println(d1.format());
        System.out.println(p1.format());
        System.out.println(c1.format());
    }
}
