package ImplementingAClass;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());

        Employee employee2 = new Employee("kamal", 1500);

        System.out.println(employee2.getName());
        System.out.println(employee2.getSalary());
    }
}
