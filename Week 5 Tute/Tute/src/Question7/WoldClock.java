package Question7;

public class WoldClock extends Clock{

    private int timeZone;

    private int alarmHour;
    private int alarmMinute;

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
