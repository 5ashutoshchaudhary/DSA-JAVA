package Stack;
import java.util.*;
public class ReverseStack {
    public static void PushLast(Stack<Integer>s,int val){
        if (s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        PushLast(s,val);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        PushLast(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(99);
        s.push(99);
        s.push(44);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }

    }
}
