package VendingMachine;

public class VendingMachineTester {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        machine.fillUp(10);
        machine.insertToken();
        machine.insertToken();
        System.out.println("Token count = " + machine.getToken());
        System.out.println("Can count = " + machine.getCans());
    }
}
