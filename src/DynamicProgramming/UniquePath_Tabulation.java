package DynamicProgramming;
import java.util.*;
public class UniquePath_Tabulation {
    public static int Paths(int n,int m,int [][]dp){
        for(int i = 0; i<m; i++) dp[i][0] = 1;
        for(int j = 0; j<n; j++) dp[0][j] = 1;

        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [][]dp = new int[m][n];
        System.out.print("Total Ways: " + Paths(m,n,dp));
    }
}
