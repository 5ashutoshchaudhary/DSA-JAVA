package arrayLIst;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(10);
        nums.add(3);
        nums.add(5);
        nums.add(8);
        System.out.println(nums);
        System.out.println("Here is reversed: ");
        Collections.reverse(nums);
        System.out.println(nums);
        for(int i = nums.size()-1; i>=0; i--){
            System.out.print(nums.get(i) + " ");
        }
    }
}
