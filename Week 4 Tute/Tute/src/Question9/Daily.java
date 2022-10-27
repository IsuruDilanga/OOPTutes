package Question9;

public class Daily extends Appointment{

    public Daily(String n, int year, int month, int day){
        super(n, year, month, day);
    }

    public boolean occursOn(int year, int month, int day){
        if (this.year == year && this.month == month && this.day == day){
            return true;
        }
        return false;
    }
}
