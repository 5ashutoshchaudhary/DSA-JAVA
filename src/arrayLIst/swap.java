package arrayLIst;
import java.util.*;
import java.util.Scanner;
public class swap {
    public static void SWAP(ArrayList<Integer>Marks,int idx1,int idx2){
    int temp = Marks.get(idx1);
    Marks.set(idx1,Marks.get(idx2));
    Marks.set(idx2,temp);
        System.out.println(Marks);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>Marks = new ArrayList<>();
        Marks.add(2);
        Marks.add(3);
        Marks.add(5);
        Marks.add(8);
        System.out.println(Marks);
        System.out.print("Enter first index: ");
        int idx1 = sc.nextInt();
        System.out.print("Enter second index: ");
        int idx2 = sc.nextInt();
        SWAP(Marks,idx1,idx2);
    }
}
