package DSA;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 2147483647;
        int result = reverseInteger(x);
        System.out.println("The reversed integer value is :" + result);
    }
    public static int reverseInteger(int x) {
        int reverse = 0;
        while( x != 0 ) {
            //extract last digit
            int pop = x % 10;
            x = x / 10;
            if( reverse >= Integer.MAX_VALUE / 10 ){
                return 0;
            }
            reverse = reverse * 10 + pop;
        }
        return reverse;
    }
}
