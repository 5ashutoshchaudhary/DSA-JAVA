package DynamicProgramming;
import java.util.*;
    public class FibonacciTabulation {

        public static int fibo(int n) {
            int[] dp = new int[3];
            if(n == 0) return 0;
            if(n == 1) return 1;
            // base cases
            dp[0] = 0;
            dp[1] = 1;

            // fill table (bottom-up)
            for(int i = 2; i <= n; i++) {
                dp[2] = dp[0] + dp[1];
                dp[0] = dp[1];
                dp[1] = dp[2];
            }

            return dp[1];
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the term: ");
            int n = sc.nextInt();
            for(int i = 0; i<n; i++) {
                System.out.print(fibo(i) + " ");
            }
        }
    }


