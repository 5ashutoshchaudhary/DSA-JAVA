package Stack;
import java.util.*;

public class StackUsingCollection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(99);
        s.push(88);

        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped element: " + s.pop());
        }

        if (s.isEmpty()) {
            System.out.println("Stack is empty now");
        } else {
            System.out.println("Top element: " + s.peek());
        }
    }
}

