package Stack;
import java.util.*;
public class BottomPush {
    public static void pushAtBottom(Stack<Integer> s,int val){
    if(s.isEmpty()){
        s.push(val);
        return;
    }
    int top = s.pop();
    pushAtBottom(s,val);
    s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(8);
        s.push(88);
        s.push(77);
        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
