package Recursion;
import java.util.Scanner;
public class Factorial {
    public static int Fact(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int factorial = n * Fact(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result = Fact(n);
        System.out.print("Factorial of " + n + " is: " + result);
    }
}
