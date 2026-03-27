package DynamicProgramming;

public class Target_Sum_Dp {
    public static Boolean TargetSum(int []arr,int i,int target,Boolean[][]dp){
        if(i==arr.length){
            if(target == 0) return true;
            else return false;
        }
        if(dp[i][target]!=null) return dp[i][target];
        Boolean skip = TargetSum(arr,i+1,target,dp);
        if(target-arr[i]<0) return dp[i][target] = skip;
        Boolean take = TargetSum(arr,i+1,target-arr[i],dp);
        dp[i][target] = skip || take;
        return dp[i][target];
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int target = 11;
        int n = arr.length;
        Boolean [][]dp = new Boolean [n][target+1];
        System.out.print("Is There Subset Exists: " + TargetSum(arr,0,11,dp));
    }
}
