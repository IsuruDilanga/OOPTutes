package OverloadingMethods;

public class CarTesting {

    public static void main(String[] args) {

        Car car1 = new Car("AB001", 100);
        Car car2 = new Car("AB002",50,200);
        Car car3 = new Car("AB003", 150, 80);

        car1.display();
        System.out.println();
        car2.display();
        System.out.println();
        car3.display();
    }
}
