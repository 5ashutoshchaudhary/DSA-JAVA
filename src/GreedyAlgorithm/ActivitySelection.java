package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection {
    public static void SelectActivity(int []start, int []end){
        ArrayList<Integer> act = new ArrayList<>();
        act.add(0);
        int maxAct = 1;
        int lastEnd = end[0];
        for(int i = 1; i<end.length; i++){
            int nextStart = start[i];
            if(nextStart>=lastEnd){
                lastEnd = end[i];
                maxAct++;
                act.add(i);
            }
        }
        System.out.print("Maximum activity : " + maxAct);
        System.out.println();
        System.out.print("These are the activities: ");
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
