package DynamicProgramming;
import java.util.*;
public class FriendsPairing_memo {
    public static int Pair(int n,int []dp){
        if(n<=2){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = Pair(n-1,dp) + (n-1)*Pair(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Friends: ");
        int n = sc.nextInt();
        int []dp = new int[n+1];
        System.out.print("Total Ways: " + Pair(n,dp));
    }
}
