package DynamicProgramming;

public class KnapsackZeroOne_Memoization {
    public static int KnapSack(int []val,int []wt,int w,int n,int [][]dp){
        if(w == 0 || n == 0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){
            //include
            int ans = val[n-1] + KnapSack(val,wt,w-wt[n-1],n-1,dp);
            //Exclude
            int ans2 = KnapSack(val,wt,w,n-1,dp);
            dp[n][w] = Math.max(ans,ans2);
            return dp[n][w];
        }else{
            dp[n][w] = KnapSack(val,wt,w,n-1,dp);
            return dp[n][w];
        }
    }
    public static void main(String[] args) {
        int []val = {15,14,10,45,30};
        int []wt = {2,5,1,3,4};
        int w = 7;
        int n = wt.length;
        int [][]dp = new int[n+1][w+1];
        for(int i = 0; i<n+1; i++){
            for(int j = 0; j<w+1; j++){
                dp[i][j] = -1;
            }
        }
        int result = KnapSack(val,wt,w,n,dp);
        System.out.print("The max possible Value: " + result);
    }
}
