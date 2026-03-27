package DynamicProgramming;

public class Target_Sum {
    public static boolean TargetSum(int[]arr,int i,int target){
        if(i==arr.length){
            if(target == 0) return true;
            else return false;
        }
        boolean skip = TargetSum(arr,i+1,target);
        if(target-arr[i]<0) return skip;
        boolean take = TargetSum(arr,i+1,target-arr[i]);
        return take || skip;
    }

    public static void main(String[] args) {
       int[] arr = {2, 5, 7, 8, 10};
        int target = 11;
        System.out.print("Is There Subset Exists: " + TargetSum(arr,0,11));
    }
}
