package Question2;

public class EmployeeManager {
    public static void main(String[] args) {

        Address a1 = new Address("Watford Road", 101, "London");
        Address a2 = new Address("Guilford Road", 5, "York");
        Address a3 = new Address("Exhibition Road", 77, "London");

        a1.print();
        a2.print();
        a3.print();

        System.out.println("\nMemory location for e1.company_address object: " + a1);
        System.out.println("Memory location for e2.company_address object: " + a2);
        System.out.println("Memory location for e3.company_address object: " + a3);


        a1 = a2;

        Employee e1 = new Employee("John", a1);
        Employee e2 = new Employee("George", a2);
        Employee e3 = new Employee("Helen", a3);

        System.out.println("\nEmployee\n");

        e1.print();
        e2.print();
        e3.print();

        System.out.print("e1 contains: ");
        e1.print();
        System.out.print("e2 contains: ");
        e2.print();
        System.out.print("e3 contains: ");
        e3.print();

        e1.company_address = a2;

        System.out.println("\nAfter e.company_address = a2\n");

        System.out.print("e1 contains: ");
        e1.print();
        System.out.print("e2 contains: ");
        e2.print();
        System.out.print("e3 contains: ");
        e3.print();

        System.out.println("\nMemory location for e1.company_address object: " + e1.company_address);
        System.out.println("Memory location for e2.company_address object: " + e2.company_address);
        System.out.println("Memory location for e3.company_address object: " + e3.company_address);
        System.out.println("\ne1.numberOfEmployees: " + e1.numberOfEmployees);
        System.out.println("e2.numberOfEmployees: " + e2.numberOfEmployees);
        System.out.println("e3.numberOfEmployees: " + e3.numberOfEmployees);
    }
}
