package Question5;

import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class DateTest {
    @Test
    public void getYearTest(){
        Date date = new Date(2022, 12,13);
//        date.setYear(2022);
        assertEquals(2022, date.getYear(), 0.001);
    }

    @Test
    public void getMonthTest(){
        Date date = new Date(2022,12,13);
        assertEquals(12, date.getMonth(), 0.001);
    }

    @Test
    public void equalTest(){
        Date d = new Date(2019,2,12);
        d.addDays(4);

        Date exp = new Date(2019, 2, 16);
        d.equals(exp);
        assertEquals(exp, d);
    }

    @Test
    public void addDaysTest(){
        Date d = new Date(2022, 12, 13);
        d.addDays(4);
        assertEquals(17, d.getDate(), 0.001);
    }

    @Test
    public void printDateTest(){
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        String separator = System.getProperty("line.separator");

        Date d = new Date(2019,12,28);
        d.printDate();
        assertEquals("The date is 2019-12-28" + separator, os.toString());

        System.setOut(originalOut);
    }

}
