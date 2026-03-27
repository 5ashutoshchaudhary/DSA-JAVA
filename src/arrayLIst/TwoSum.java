package arrayLIst;
import java.util.*;
public class TwoSum {
    public static boolean Twosum(ArrayList<Integer> arr,int target){
        Collections.sort(arr);
        int left = 0,right = arr.size()-1;
        int sum = arr.get(left) + arr.get(right);
        while(left<right){
            if(sum == target){
                return true;
            } else if (sum<target) {
                left++;
            }else{
                right--;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        int target = 9;
        boolean result = Twosum(arr,target);
        System.out.print(result);
    }
}
