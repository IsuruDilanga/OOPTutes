import java.util.Arrays;
import java.util.Random;

public class Question6 {

    public static void main(String[] args) {

        int[] lotteryNumbers = new int[6];

        for (int i = 0; i < lotteryNumbers.length; i++){
            lotteryNumbers[i] = (int) (Math.random() * 49);
        }

        System.out.println(Arrays.toString(lotteryNumbers));

        for (int i = 0; i < lotteryNumbers.length - 1; i++){
            for (int k = i + 1; k < lotteryNumbers.length; k++){
                if (lotteryNumbers[i] == lotteryNumbers[k]){
                    lotteryNumbers[i] = (int) (Math.random() * 49);
                }
            }
        }

        System.out.println(Arrays.toString(lotteryNumbers));


    }
}
