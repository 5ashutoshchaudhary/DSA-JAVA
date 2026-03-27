package Recursion;
import java.util.*;
public class Power {
    public static double POWER(int x,int n){
        if(n==0){
            return 1;
        }
        double Pow = POWER(x,n/2);
        if(n<0){
            return 1.0/POWER(x,-n/2);
        }
        if(n%2 == 0) {
            return Pow * Pow;
        }
        return x*Pow*Pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Power: ");
        int n = sc.nextInt();
        double result = POWER(x,n);
        System.out.print(x + " power " + n + " : " + result);
    }
}
