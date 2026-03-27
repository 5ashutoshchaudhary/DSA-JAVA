package Shorting;
import java.util.Arrays;
public class inbuiltSort {
    public static void main(String[] args) {
        int [] Num = {8,5,2,3,4};
//        Arrays.sort(Num);
        Arrays.sort(Num,0,4);
        for(int i = 0; i<Num.length; i++){
            System.out.print(Num[i] + " ");
        }
    }
}
