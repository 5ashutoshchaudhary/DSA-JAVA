package Recursion;
import java.util.Scanner;
public class XpowerN {
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*Power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int result = Power(x,n);
        System.out.print( x + " power " + n + " is : " + result );
    }
}
