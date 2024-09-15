package DSA;

public class maxSubarrayKadane {
    public static void main(String[] args) {
        int nums[] = { -2,1,-3,4,-1,2,1,-5,4 };
        int maxSum = maxSubarrayKadane(nums);
        System.out.println("Your maximum sum of Subarray is : "+ maxSum);
    }
    static int maxSubarrayKadane(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for( int i = 0; i < nums.length; i++ ){
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
            if( currentSum < 0 ){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
