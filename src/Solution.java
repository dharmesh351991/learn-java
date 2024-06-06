import java.util.*;

public class Solution {

    public List<String> permute(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);  // Sort the characters to ensure lexicographical order
        boolean[] used = new boolean[arr.length];
        List<String> results = new ArrayList<>();
        StringBuilder currentPermutation = new StringBuilder();
        permuteHelper(arr, used, currentPermutation, results);
        return results;
    }

    private void permuteHelper(char[] arr, boolean[] used, StringBuilder currentPermutation, List<String> results) {
        if (currentPermutation.length() == arr.length) {
            results.add(currentPermutation.toString());
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i]) {
                continue;  // Skip already used characters
            }
            // Avoid generating duplicate permutations
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            currentPermutation.append(arr[i]);
            System.out.println("======Before================");
            System.out.println("used[i] : " + used[i] + " Where i Is "+ i);
            System.out.println("currentPermutation : " + currentPermutation);
            System.out.println("results : " + results);
            permuteHelper(arr, used, currentPermutation, results);
            // Backtrack
            used[i] = false;
            currentPermutation.deleteCharAt(currentPermutation.length() - 1);
            System.out.println("======After================");
            System.out.println("used[i] : " + used[i] + " Where i Is "+ i);
            System.out.println("currentPermutation : " + currentPermutation);
            System.out.println("results : " + results);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> permutations = solution.permute("ABC");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
