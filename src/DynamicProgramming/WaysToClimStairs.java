package DynamicProgramming;
import java.util.*;
public class WaysToClimStairs {
    public static int Ways(int n,int[]dp){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = Ways(n-1,dp) + Ways(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stair number: ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        System.out.print(Ways(n,dp) + " ");
    }
}
