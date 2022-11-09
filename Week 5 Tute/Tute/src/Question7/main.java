package Question7;

public class main {
    public static void main(String[] args) {

        WoldClock woldClock = new WoldClock(3);

//        System.out.println("My time + 3: " + woldClock.getTime());
        woldClock.setAlarm(13,35);
        System.out.println(woldClock.getTime());
    }

}
