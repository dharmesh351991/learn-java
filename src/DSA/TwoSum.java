package DSA;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 3,2,4 };
        int target = 6;
        int[] result = TwoSumBrute(nums, target);
        System.out.println("Your Two Sum result is: "+ Arrays.toString(result));
    }
    static int[] TwoSumBrute(int[] nums, int target) {
        int n = nums.length;
        for( int i = 0; i < n; i++ ){
            for ( int j = i + 1; j < n; j++ ){
                if( nums[i] + nums[j] == target ){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
