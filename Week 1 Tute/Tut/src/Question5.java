public class Question5 {

    public static void main(String[] args) {

        String x = "abc";
        String y = x;
        y = new String("123");
        String z = x;
        y = x;
        z = "456";
        System.out.println(x+y+z);
    }
}
