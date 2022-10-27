package Question9;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Appointment implements Comparable<Appointment>{

    String description;
    int year;
    int month;
    int day;

    public Appointment(String description, int year, int month, int day){
        this.description = description;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDescription(){
        return this.description;
    }

    public String dayOfTheWeek(){

        Calendar calendar = new GregorianCalendar(this.year, this.month-1, this.day);
        String dayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
        return dayName;
    }

    public void displayAll(){
        if (!getDescription().equals("aaa")){
            System.out.println("Year: " + this.year + " Month: " + this.month + " date: " + this.day);
            System.out.println("Day of week: " + dayOfTheWeek());
            System.out.println("Description: " + getDescription());
            System.out.println();
        }
    }

    @Override
    public int compareTo(Appointment o) {
        if ((parseInt(String.valueOf(this.year)+String.valueOf(this.month)+String.valueOf(this.day))) >
                (parseInt(String.valueOf(o.year)+String.valueOf(o.month)+String.valueOf(o.day)))){
            return 1;
        } else if((parseInt(String.valueOf(this.year)+String.valueOf(this.month)+String.valueOf(this.day))) <
                (parseInt(String.valueOf(o.year)+String.valueOf(o.month)+String.valueOf(o.day)))){
            return  -1;
        } else {
            return 0;
        }
    }
}
