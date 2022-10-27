package Question9;

import java.util.*;

import static java.lang.Integer.parseInt;

public class main {

    static int oneTimeCount = 0;
    static int dailyCount = 0;
    static int monthlyCount = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Onetime[] onetime = new Onetime[3];
        Daily[] daily = new Daily[3];
        Monthly[] monthly = new Monthly[3];

        initialise(onetime, daily, monthly);

        boolean run = true;
        while (run) {
            System.out.println("""
                Choose the appointment category from below options
                A : ascendingOrder
                O : Onetime appointment
                D : Daily appointment
                M : Monthly appointment
                C : check the appointment
                v : Display
                E : exit
                """);

            switch (input.next().toUpperCase().charAt(0)){
                case 'A' -> ascendingOrder(onetime, daily, monthly);
                case 'O' -> addOneTime(onetime);
                case 'D' -> addDaily(daily);
                case 'M' -> addMonthly(monthly);
                case 'C' -> checkAppointment(onetime, daily, monthly);
                case 'V' -> display(onetime, daily, monthly);
                case 'E' -> run = false;
                default -> System.out.println("Please choose correct option");
            }
        }
    }

    public static void ascendingOrder(Onetime[] onetime, Daily[] daily, Monthly[] monthly){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < onetime.length; i++){
            if (onetime[i].year != 0){
                list.add(parseInt(String.valueOf(onetime[i].year) + String.valueOf(onetime[i].month) + String.valueOf(onetime[i].day)));
            }
        }

        for (int i = 0; i < daily.length; i++){
            if (daily[i].year != 0){
                list.add(parseInt(String.valueOf(daily[i].year) + String.valueOf(daily[i].month) + String.valueOf(daily[i].day)));
            }
        }

        for (int i = 0; i < monthly.length; i++){
            if (monthly[i].year != 0){
                list.add(parseInt(String.valueOf(monthly[i].year) + String.valueOf(monthly[i].month) + String.valueOf(monthly[i].day)));
            }
        }

        Collections.sort(list);{
            for (int i = 0; i < list.size(); i++){
                for (int j = 0 ; j < onetime.length; j++){
                    if (list.get(i) == parseInt(String.valueOf(onetime[j].year) + String.valueOf(onetime[j].month) + String.valueOf(onetime[j].day))){
                        onetime[j].displayAll();
                    }
                }
                for (int j = 0 ; j < daily.length; j++){
                    if (list.get(i) == parseInt(String.valueOf(daily[j].year) + String.valueOf(daily[j].month) + String.valueOf(daily[j].day))){
                        daily[j].displayAll();
                    }
                }
                for (int j = 0 ; j < monthly.length; j++){
                    if (list.get(i) == parseInt(String.valueOf(monthly[j].year) + String.valueOf(monthly[j].month) + String.valueOf(monthly[j].day))){
                        monthly[j].displayAll();
                    }
                }
            }
        }
    }

    public static void checkAppointment(Onetime[] onetime, Daily[] daily, Monthly[] monthly){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter day: ");
        int day = input.nextInt();

        boolean checkOneTimeBooking = false;
        for (int i = 0; i < onetime.length; i++){
            if (onetime[i].occursOn(year,month,day) && !checkOneTimeBooking){
                System.out.println("\none time appointment found");
                System.out.println(onetime[i].getDescription());
                checkOneTimeBooking = true;
            }
        }
        if (!checkOneTimeBooking){
            System.out.println("\nOne time appointment not found");
        }

        boolean checkDailyBooking = false;
        for (int i = 0; i < daily.length; i++){
            if (daily[i].occursOn(year,month,day) && !checkDailyBooking){
                System.out.println("\nDaily appointment found");
                System.out.println(daily[i].getDescription());
                checkDailyBooking = true;
            }
        }
        if (!checkDailyBooking){
            System.out.println("\nDaily appointment not found");
        }

        boolean checkMonthlyBooking = false;
        for (int i = 0; i < monthly.length; i++){
            if (monthly[i].occursOn(year,month,day) && !checkMonthlyBooking){
                System.out.println("\nMonthly appointment found");
                System.out.println(monthly[i].getDescription());
                checkMonthlyBooking = true;
            }
        }
        if (!checkMonthlyBooking){
            System.out.println("\nMonthly appointment not found\n");
        }
    }

    public static void display(Onetime[] onetime, Daily[] daily, Monthly[] monthly){
        System.out.println("One time appointment\n");
        for (int i = 0; i < onetime.length; i++){
            onetime[i].displayAll();
        }

        System.out.println("\nDaily appointment\n");
        for (int i = 0; i < daily.length; i++){
            daily[i].displayAll();
        }

        System.out.println("\nMonthly appointment\n");
        for (int i = 0; i < monthly.length; i++){
            monthly[i].displayAll();
        }

    }

    public static void addOneTime(Onetime[] onetime){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the description: ");
        String decOnetime = input.nextLine();

        System.out.println("Enter Year: ");
        int year = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter day: ");
        int day = input.nextInt();

        if (oneTimeCount < onetime.length){
            onetime[oneTimeCount] = new Onetime(decOnetime, year, month, day);
            oneTimeCount++;
        }

    }

    public static void addDaily(Daily[] daily){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the description: ");
        String decDaily = input.nextLine();

        System.out.println("Enter Year: ");
        int year = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter day: ");
        int day = input.nextInt();

        if (dailyCount < daily.length){
            daily[dailyCount] = new Daily(decDaily, year, month, day);
            dailyCount++;
        }
    }

    public static void addMonthly(Monthly[] monthly){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the description: ");
        String decMonthly = input.nextLine();

        System.out.println("Enter Year: ");
        int year = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter day: ");
        int day = input.nextInt();

        if (monthlyCount < monthly.length){
            monthly[monthlyCount] = new Monthly(decMonthly, year, month, day);
            monthlyCount++;
        }
    }

    public static void initialise(Onetime[] onetimes, Daily[] daily, Monthly[] monthly){

        for (int i = 0; i < onetimes.length; i++){
            onetimes[i] = new Onetime("aaa",0,0,0);
        }

        for (int i = 0; i < daily.length; i++){
            daily[i] = new Daily("aaa",0,0,0);
        }

        for (int i = 0; i < monthly.length; i++){
            monthly[i] = new Monthly("aaa",0,0,0);
        }
    }
}
