package arrayLIst;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
    ArrayList<Integer>nums = new ArrayList<>();
    nums.add(2);
    nums.add(3);
    nums.add(5);
    nums.add(8);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
        for(int i = 0; i<nums.size(); i++){
            System.out.print(nums.get(i) + "  ");
        }
    }
}
