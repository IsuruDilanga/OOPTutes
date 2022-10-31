package Question7;

public class main {
    public static void main(String[] args) {
//        Clock myClock = new Clock();
//        System.out.println("My Time: " + myClock.getTime());

        WoldClock woldClock = new WoldClock(3);

        System.out.println("My time + 3: " + woldClock.getTime());
        woldClock.setAlarm(16,50);

//        myClock.setAlarm(16,40);
    }

}
