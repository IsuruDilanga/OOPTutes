package VendingMachine;

public class VendingMachine {

    private int token;
    private int cans;

    public VendingMachine(){
        this.cans = 0;
        this.token = 0;
    }

    public int getToken(){
        return token;
    }

    public int getCans(){
        return cans;
    }

    public void insertToken(){
        if (cans > 0) {
            token++;
            cans--;
        } else {
            System.out.println("Out of cans");
        }
    }

    public void fillUp(int cans){
        this.cans = this.cans + cans;
    }

}
