package DynamicProgramming;
import java.util.*;
public class FriendsPairing_Tabulation {
    public static int Pair(int n,int[]dp){
        if(n<=2) return n;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<dp.length; i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.print("Enter total Friends: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []dp = new int[n+1];
        System.out.print("Total Ways: " + Pair(n,dp));
    }
}
