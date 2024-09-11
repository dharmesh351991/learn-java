package Patterns.SlidingWindow;
import java.util.HashMap;
public class LengthOfLongestSubstring {
    public static int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        //HashMap for storing character occurrences
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for( int end = 0; end < n; end++ ){
            //get current Character
            char currentChar = s.charAt(end);
            //check if currentChar is exist and update the start to right
            if( map.containsKey(currentChar) && map.get(currentChar) >= start ){
                start = Math.max( map.get(currentChar) + 1, start );
            }
            //Update current char in Hash
            map.put(currentChar, end);
            //Calculate current length
            int len = end - start + 1;
            //Update the maxLength
            maxLength = Math.max( maxLength, len );
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int result = longestNonRepeatingSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
