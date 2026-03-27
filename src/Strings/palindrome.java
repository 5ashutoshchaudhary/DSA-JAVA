package Strings;
import java.util.*;
public class palindrome {
    public static boolean Pelindrome(String word){
        int n = word.length();
        for(int i = 0; i<n/2; i++){
           if(word.charAt(i)!= word.charAt(n-1-i)){
               return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to check pelindrome: ");
        String word = sc.nextLine();
        boolean check = Pelindrome(word);
        if(check==true){
            System.out.print(word + " Is pelindrome");
        }else{
            System.out.print(word + " Is not a pelindrome");
        }
    }
}
