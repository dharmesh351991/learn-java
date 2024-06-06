import java.util.*;

public class SubsetString {
    public static void main(String[] args) {
        System.out.println(nCr(5,2));
    }
    public static List<String> findSubstrings(String s) {
        int len = s.length();
        List<String> resultData = new ArrayList<>();
        for(int i=0; i<len; i++){
            for (int j = i; j<len; j++){
                resultData.add(s.substring(i, j+1));
            }
        }
        System.out.println("Your resulting subString is: "+ resultData);
        return  resultData;
    }
    public static void generateSubsets(String s, int index, String currentSubset){
        //base case
        //System.out.println(index+ "Hello: Len" + s.length());
        if( s.length() == index){
            System.out.println(currentSubset);
            return;
        }
        //Include current character and generate subset
        generateSubsets(s, index+1, currentSubset + s.charAt(index));
        generateSubsets(s, index+1, currentSubset);
    }

    static int nCr(int n, int r){
        //base case
        if(n==r || r==0 ) return 1;
        return nCr(n-1, r-1) + nCr(n-1,r);
    }
}
