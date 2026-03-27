package GreedyAlgorithm;
import java.util.*;
public class maxChainLengthOfPairs {
    public static void main(String[] args) {
        int [][]Pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(Pairs,Comparator.comparing(a->a[1]));
        ArrayList<Integer> list = new ArrayList<>();
        int chainLen = 1;
        list.add(0);
        int FirstEnd = Pairs[0][1];
        for(int i = 1; i<Pairs.length; i++){
            int SecondsStart = Pairs[i][0];
            if(SecondsStart>FirstEnd){
                list.add(i);
                chainLen++;
                FirstEnd = Pairs[i][1];
            }
        }
        System.out.print("Total length: " + chainLen);
        System.out.println();
        System.out.print("Possible Pairs: ");
        for(int i = 0; i<list.size(); i++){
            System.out.print("p"+(list.get(i)+1) + " ");
        }
    }
}
