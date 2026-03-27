package Recursion;
import java.util.Scanner;

public class PrintIncreasingAndDecreasing {

    public static void PrintInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintInc(n - 1);
        System.out.print(n + " ");
    }

    public static void PrintDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        PrintDec(n);
        System.out.println();
        PrintInc(n);

        sc.close();
    }
}


