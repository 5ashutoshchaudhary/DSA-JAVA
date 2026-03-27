package Strings;
import java.util.*;
public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.charAt(5));
        for(int i = 0; i<name.length();i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
}
