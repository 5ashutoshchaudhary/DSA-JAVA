package Recursion;
import java.util.Scanner;
public class OptimiZed_power {

        public static double power(int x, int n) {
            if (n == 0) {
                return 1;
            }

            if (n < 0) {
                return 1.0 / power(x, -n/2);
            }

            double halfPower = power(x, n / 2);
            double halfPowerSq = halfPower * halfPower;

            if (n % 2 != 0) {
                return x * halfPowerSq;
            }

            return halfPowerSq;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter X : ");
            int x = sc.nextInt();
            System.out.print("Enter N: ");
            int n = sc.nextInt();

            double result = power(x, n);
            System.out.println(x + " power " + n + " is : " + result);

            sc.close();
        }
}

