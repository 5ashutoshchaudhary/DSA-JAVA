package Stack;
import java.util.*;
public class validparentheses {
    public static boolean IsValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '{' && ch == '}') ||
                        (s.peek() == '[' && ch == ']')) {
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the parentheses String: ");
        String str = sc.nextLine();
        boolean result = IsValid(str);
        System.out.print(result);
    }
}
