package Recursion;
import java.util.Scanner;
public class FibonacciSeries {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int Sum = fnm1 + fnm2;
        return Sum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Term: ");
        int n = sc.nextInt();
        int result = fibo(n);
        System.out.print("Sum of " + n + " terms of fibonacci series: " + result);
    }
}
