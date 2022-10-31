package Question7;

import java.time.LocalDateTime;
import java.util.TimeZone;

public class Clock {

    private int alarmHour;
    private int alarmMinute;

    public String getHours(){
        String hours = java.time.LocalTime.now().toString().substring(0,2);
        return hours;
    }

    public String getMinutes(){
        String min = java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }

    public String getTime(){
        String time = getHours() + ":" + getMinutes();
        if ((this.alarmHour == Integer.parseInt(getHours()) &&  this.alarmMinute == Integer.parseInt(getMinutes()))){
            System.out.println("Alarm");
        } else if((this.alarmHour < Integer.parseInt(getHours()) && this.alarmMinute < Integer.parseInt(getMinutes()))){
            System.out.println("Alarm");
        }
        return time;
    }

    public void setAlarm(int hour, int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }

}
