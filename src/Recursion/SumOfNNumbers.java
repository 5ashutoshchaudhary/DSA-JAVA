package Recursion;

import java.util.Scanner;

public class SumOfNNumbers {

    public static int Sum(int n) {
        if (n == 1) { // ✅ base case
            return 1;
        }
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result = Sum(n);
        System.out.print("Sum of " + n + " is: " + result);
        sc.close();
    }
}

