package HashMap;
import java.util.*;
public class ElementWithMaxFreq {
    public static int MaxFreq(int []arr){
        Map<Integer,Integer> freq = new HashMap<>();
        for(int ele : arr){
            if(!freq.containsKey(ele)){
                freq.put(ele,1);
            }else{
                freq.put(ele,freq.get(ele)+1);
            }
        }
        int maxFreq = 0 , maxKey = -1;
        for(int key : freq.keySet()){
            if(freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        int []arr = {1,2,2,3,1,4,1,1};
        int result = MaxFreq(arr);
        System.out.print("Element with max frequency is: "+ result);
    }
}
