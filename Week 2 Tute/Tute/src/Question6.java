import java.util.Random;

public class Question6 {

    public static void main(String[] args) {

//        System.out.println(find(0.70));

        boolean[] daysInTheYear = new boolean[365];
        int numberOfPeople = 0;

        Random random = new Random();

        while (true){
            ++numberOfPeople;
            int birthday = random.nextInt(365);

            if (daysInTheYear[birthday]){
                break;
            }else {
                daysInTheYear[birthday] = true;
            }
        }

        System.out.println("Number of people: " + numberOfPeople);

    }

//    static double find(double p){
//
//        return Math.ceil(Math.sqrt(2 * 365 * Math.log(1 / (1 - p))));
//    }
}
