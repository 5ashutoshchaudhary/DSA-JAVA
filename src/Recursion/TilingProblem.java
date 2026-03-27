package Recursion;
import java.util.Scanner;
public class TilingProblem {
    public static int Tile(int n){
        if(n==0 || n==1){
            return 1;
        }
        int hoz = Tile(n-2);
        int vet = Tile(n-1);
        int Total = hoz + vet;
        return Total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int result = Tile(n);
        System.out.print("The numbers of ways to place tiles are : " + result);
    }
}
