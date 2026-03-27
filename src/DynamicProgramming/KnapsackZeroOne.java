package DynamicProgramming;

public class KnapsackZeroOne {
    public static int KnapSack(int []val,int []wt,int w,int i,int [][]dp){
        if(i == val.length) return 0;
        if(dp[i][w] != 0) return dp[i][w];
        int skip = KnapSack(val,wt,w,i+1,dp);
        if(wt[i]>w) return dp[i][w] = skip;
        int take = val[i]+KnapSack(val,wt,w-wt[i],i+1,dp);
        dp[i][w] =  Math.max(take,skip);
        return dp[i][w];
    }
    public static void main(String[] args) {
        int []val = {15,14,10,45,30};
        int []wt = {2,5,1,3,4};
        int w = 7;
        int i = 0;
        int n = val.length;
        int [][]dp = new int[n][w+1];
        int result = KnapSack(val,wt,w,0,dp);
        System.out.print("The max possible Value: " + result);
    }
}
