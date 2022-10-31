package Question2;

public class Employee {

    static int numberOfEmployees;
    static Address company_address;
    String name;

    Employee (String name1, Address co_address){
        name = name1;
        company_address = co_address;

        numberOfEmployees++;
    }

    public void print(){
        System.out.println("Name: " + name + ", ");
        company_address.print();
    }
}
