package Question7;

import java.time.LocalDateTime;
import java.util.TimeZone;

public class Clock {

    public String getHours(){
        String hours = java.time.LocalTime.now().toString().substring(0,2);
        return hours;
    }

    public String getMinutes(){
        String min = java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }



}
