package arrayLIst;
import java.util.*;
public class ContainerWithMostWater {
    public static void Area(ArrayList<Integer>height){
        int left = 0, right = height.size()-1;
        int max = 0;
        while(left<right){
            int H = Math.min(height.get(left),height.get(right));
            int W = right-left;
            int water = H*W;
            max = Math.max(max,water);
            if (height.get(left) < height.get(right)) {
                left++;
            }else{
                right--;
            }
        }
        System.out.print("The area of max Water: " + max);
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        Area(height);
    }
}
