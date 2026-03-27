package DynamicProgramming;
import java.util.Scanner;
public class UniquePaths {
    public static int paths(int x,int y,int m,int n,int[][]dp){
        if(x == m-1 && y == n-1){
            return 1;
        }
        if(x>=m || y>=n){
            return 0;
        }
        if(dp[x][y]!=0){
            return dp[x][y];
        }
        dp[x][y] = paths(x+1,y,m,n,dp) + paths(x,y+1,m,n,dp);
        return dp[x][y];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [][]dp = new int[m][n];
        System.out.print("Total Unique Paths: " + paths(0,0,m,n,dp));
    }
}
