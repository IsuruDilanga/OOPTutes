package Question2;

public interface Equation {

    int numberOfVariables = 1;

    double solve(); // private interface must have a body

    public static void printFormula(){  // interface abstract method cannot have a body
        System.out.println("x^2 + 3x + 1");
    }
}
