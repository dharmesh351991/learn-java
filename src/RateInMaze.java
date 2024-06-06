import java.util.*;
public class RateInMaze
{
    public static void main(String[] args) {

    }
    public static ArrayList < String > findPath(int[][] arr, int n) {
        String path = "";
        ArrayList<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        rateInMaze(arr, 0, 0, n, visited, "", paths);
        return paths;
    }
    static boolean isValidPath(int[][] arr, int i, int j, int n, boolean[][] visited){
        if( i<n && j<n && i>=0 && j>=0 && arr[i][j] == 1 && visited[i][j] == false ){
            return true;
        }
        return false;
    }
    static void rateInMaze(int[][] arr, int n, int i, int j, boolean[][] visited, String path, ArrayList<String> paths){
        if( i == n-1 && j == n -1 ){
            System.out.println(path);
            paths.add(path);
            return;
        }
        //Down side
        if( isValidPath(arr, n,  i+1, j, visited ) ){
            visited[i+1][j] = true;
            rateInMaze(arr, n, i+1, j, visited, path+"D", paths);
            visited[i+1][j] = false;
        }
        //Left side
        if( isValidPath(arr, n,  i, j-1, visited ) ){
            visited[i][j-1] = true;
            rateInMaze(arr, n, i, j-1, visited, path+"L", paths);
            visited[i][j-1] = false;
        }
        //Right side
        if( isValidPath(arr, n,  i, j+1, visited ) ){
            visited[i][j+1] = true;
            rateInMaze(arr, n, i, j=1, visited, path+"R", paths);
            visited[i][j+1] = false;
        }
        //Right side
        if( isValidPath(arr, n,  i-1, j, visited ) ){
            visited[i-1][j] = true;
            rateInMaze(arr, n, i, j, visited, path+"U", paths);
            visited[i-1][j] = false;
        }
    }
}
