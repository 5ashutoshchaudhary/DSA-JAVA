package Stack;
import java.util.*;
public class DoubleParentheses {
    public static boolean IsDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String having parentheses : " );
        String str = sc.nextLine();
        boolean result = IsDuplicate(str);
        if(result){
            System.out.print("Duplicate is found");
        }else{
            System.out.print("Duplicate is not found");
        }

    }
}
