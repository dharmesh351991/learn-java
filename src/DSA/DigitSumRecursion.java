package DSA;

public class DigitSumRecursion {
    public static void main(String[] args) {
        int answer = DigitSum(1342);
        System.out.println(answer);
    }
    static int DigitSum(int n){
        if(n == 0) return 0; //base condition
        return ( n%10 ) + DigitSum(n/10);
    }
}
