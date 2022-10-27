package Question9;

public class Onetime extends Appointment{

    public Onetime(String n, int year, int month, int day){
        super(n, year, month, day);
    }

    public boolean occursOn(int year, int month, int day){
        if (this.year == year && this.month == month && this.day == day){
            return true;
        }
        return false;
    }
}
