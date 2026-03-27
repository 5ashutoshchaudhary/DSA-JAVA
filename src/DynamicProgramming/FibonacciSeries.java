package DynamicProgramming;
import java.util.*;
public class FibonacciSeries {
    public static int fibo(int n, int[]dp){
        if(n<=1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int []dp = new int[n+1];
        for(int i = 0; i<n; i++) {
            System.out.print(fibo(n,dp) + " ");
        }
    }
}
