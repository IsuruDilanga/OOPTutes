package OverloadingMethods;

public class Car {

    private String licensePlate;
    private double speed;
    private double maxSpeed;

    public Car(String licensePlate1, double maxSpeed1){
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0){
            maxSpeed = maxSpeed1;
        } else {
            maxSpeed = 0.0;
        }
    }

    public Car(String licensePlate1, double speed1, double maxSpeed1){
        this.licensePlate = licensePlate1;

        if (speed1 >= 0.0){
            this.speed = speed1;
        } else {
            this.speed = 0.0;
        }

        if (maxSpeed1 >= 0.0){
            this.maxSpeed = maxSpeed1;
        } else {
            this.maxSpeed = 0.0;
        }

        if (speed1 > maxSpeed1){
            this.maxSpeed = this.speed;
        }
    }

    public void display(){
        System.out.println("Current Speed: "+ this.speed);
        System.out.println("Maximum Speed: "+ this.maxSpeed);
        System.out.println("License plate: "+ this.licensePlate);
    }
}
