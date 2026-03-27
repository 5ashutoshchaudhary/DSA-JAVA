package DynamicProgramming;
import java.util.*;
public class WaysToClimbTreeTabular {
    public static int ways(int[] dp , int n){
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            if(i == 1) dp[i] = dp[i-1];
            else dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int []dp = new int[n+1];
        System.out.print("Total Ways: " + ways(dp,n));
    }
}
