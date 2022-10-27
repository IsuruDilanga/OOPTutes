package ImplementingAClass;

public class Employee {

    private String name;
    private double salary;

    public Employee(){
        name = "John";
        salary = 1000.00;
    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

}
