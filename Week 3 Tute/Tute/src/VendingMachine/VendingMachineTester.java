package VendingMachine;

public class VendingMachineTester {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        machine.fillUp(5);
        machine.insertToken();
        machine.insertToken();
        System.out.println("Token count = " + machine.getToken());
        System.out.println("Can count = " + machine.getCans());

        VendingMachine machine1 = new VendingMachine(20);
        machine1.insertToken();
        machine1.insertToken();
        System.out.println("Token count = " + machine1.getToken());
        System.out.println("can count = " + machine1.getCans());
    }
}
