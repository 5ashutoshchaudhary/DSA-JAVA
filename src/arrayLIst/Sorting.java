package arrayLIst;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(6);
        nums.add(3);
        nums.add(10);
        nums.add(8);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(nums);
    }
}
