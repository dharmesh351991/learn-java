package Patterns.SlidingWindow;
import java.util.ArrayList;

public class MaxSumSubarrayofsizeK {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(2);
        Arr.add(1);
        Arr.add(5);
        Arr.add(1);
        Arr.add(3);
        Arr.add(2);
        int K = 3;
        long result = maximumSumSubarray(K, Arr, Arr.size());
        System.out.println("Maximum sum of subarray of size " + K + " is: " + result);
    }
    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long maxSum = Long.MIN_VALUE;
        long currentSum = 0; //initialize current sum to 0
        //find sum of window size k
        for(int i=0; i<K; i++){
            currentSum += Arr.get(i);
        }
        //Set the maxSum value as currentsum for intial window size
        maxSum = currentSum;
        //start Slide to calculate from window size to array length
        for(int i = K; i < N; i++){
            //add new element to currentSum and substract first added
            currentSum += Arr.get(i) - Arr.get(i-K);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
