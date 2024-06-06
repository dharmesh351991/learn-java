package DSA;

public class BSRecursion {
    public static void main(String[] args) {
        int[] arr = {1,4,6,78,89,99,890};
        int target = 890;
        int result = search(arr, target, 0, arr.length-1);
        System.out.println("Result : " +  result);
    }
    static int search(int[] arr, int target, int s, int e){
        if( s > e ){
            return -1;
        }
        int m = s + ( e- s) /2;
        if( arr[m] == target){
            return m;
        }
        if( target < arr[m] ){
            return search(arr, target, s, m -1);
        }
        return search(arr, target, m + 1, e);
    }
}

