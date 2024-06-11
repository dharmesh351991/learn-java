package DSA;

public class FactRecursion {
    public static void main(String[] args) {
        int answer = fact(4);
        System.out.println(answer);
    }
    static int fact(int n){
        if( n <=1 ) return 1;
        return n * fact(n-1);
    }
}
