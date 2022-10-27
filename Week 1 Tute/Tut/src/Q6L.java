public class Q6L {

    public static void main(String[] args) {

        int numbers[] = new int[6];

        for(int i = 0; i < numbers.length; i++){
            setRandom(numbers, i);
        }

        for(int number: numbers){
            System.out.println(number);
        }
    }
}
