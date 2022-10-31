package Question7;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class WoldClock extends Clock{

    private int timeZone;

    public WoldClock(int timeZone){
        super();
        this.timeZone = timeZone;
    }

    @Override
    public String getHours(){
        String hours = String.valueOf(Integer.parseInt(super.getHours()) + 3);
        return hours;
    }

    @Override
    public String getMinutes(){
        String minute = String.valueOf(Integer.parseInt(super.getMinutes()) + 3);
        return minute;
    }

}
