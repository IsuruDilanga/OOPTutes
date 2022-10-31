package Question1;

public class CalcManager {

    public static boolean isEven(int n ){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }

    public static int cube(int n){
        return n*n*n;
    }

    public static double add(double...x){
        double sum = 0.0;

        for (double e : x){
            sum += e;
        }

        return sum;
    }
}
