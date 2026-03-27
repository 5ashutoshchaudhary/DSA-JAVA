package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection2 {
    // Here the end wala time is not sorted;
    public static void SelectActivity(int []start, int []end){
        int n = start.length;
        int [][]arr = new int[n][3];
        for(int i = 0; i<n; i++){
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }
        Arrays.sort(arr,Comparator.comparingInt(A -> A[2]));
        ArrayList<Integer> act = new ArrayList<>();
        act.add(arr[0][0]);
        int maxAct = 1;
        int lastEnd = arr[0][2];
        for(int i = 1; i<n; i++){
            int nextStart = arr[i][1];
            if(nextStart>=lastEnd){
                maxAct++;
                lastEnd = arr[i][2];
                act.add(arr[i][0]);
            }
        }
        System.out.print("Total no of Activity: " + maxAct);
        System.out.println();
        System.out.print("These are the activity: ");
        for(int i = 0; i<act.size(); i++){
            System.out.print("A" + act.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        int []start = {1,3,0,5,8,5};
        int []end = {2,4,6,7,9,9};
        SelectActivity(start,end);
    }
}
