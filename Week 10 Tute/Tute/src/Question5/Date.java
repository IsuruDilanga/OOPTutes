package Question5;

import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class Date extends java.util.Date{

    private int year;
    private int month;
    private int date;

    public Date(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        if (!super.equals(o)) return false;

        Date date1 = (Date) o;

        if (year != date1.year) return false;
        if (month != date1.month) return false;
        return date == date1.date;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + year;
        result = 31 * result + month;
        result = 31 * result + date;
        return result;
    }

    public void addDays(int days){
        this.date += days;
    }

    public void printDate(){
        System.out.println("The date is "+ this.year +"-"+this.month+"-"+this.date);
    }



//    @Override
//    public boolean equals(Date obj) {
//        return compareTo(obj) == 0;
//    }
}
