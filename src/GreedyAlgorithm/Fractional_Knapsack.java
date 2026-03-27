package GreedyAlgorithm;
import java.util.*;
public class Fractional_Knapsack {
    public static void FractionKnapsack(int []val,int []weight, int w){
        double [][]ratio = new double[val.length][2];
        for(int i = 0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(a -> -a[1]));
        int capacity = w;
        double totalValue = 0;
        for(int i = 0; i<val.length; i++){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                totalValue+=val[idx];
                capacity-= weight[idx];
            }else {
                totalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.print("Final value: " + totalValue);
    }
    public static void main(String[] args) {
        int []val = {60,100,120};
        int []weight = {10,20,30};
        int w = 50;
        FractionKnapsack(val,weight,w);
    }
}
