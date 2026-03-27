package DynamicProgramming;

public class KnapSackZeroOne_Tabulation {
    public static int Tabulation(int []val,int []wt,int w,int n){
        int [][]dp = new int[n+1][w+1];
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<w+1; j++){
                if(wt[i-1]<=j){
                    int include = val[i-1] + dp[i-1][j-wt[i-1]];
                    int exclude = dp[i-1][w];
                    dp[i][j] = Math.max(include,exclude);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int []val = {15,14,10,45,30};
        int []wt = {2,5,1,3,4};
        int w = 7;
        int n = wt.length;
        int result = Tabulation(val,wt,w,n);
        System.out.print("Maximum possible value: " + result);
    }
}
