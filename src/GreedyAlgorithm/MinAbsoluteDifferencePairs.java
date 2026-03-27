package GreedyAlgorithm;
import java.util.*;
public class MinAbsoluteDifferencePairs {
    public static void MinAbsoluteDiff(int []A,int []B){
        int n = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int PairSum = 0;
        for(int i = 0; i<n; i++){
            PairSum+= Math.abs(A[i] - B[i]);
        }
        System.out.print("Here is the Absolute Min pairSum: " + PairSum);
    }
    public static void main(String[] args) {
        int []A = {4,1,8,7};
        int []B = {2,3,6,5};
        MinAbsoluteDiff(A,B);
    }
}
