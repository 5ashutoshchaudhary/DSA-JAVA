package Stack;
import java.util.*;

public class StackUsingArraylist {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static int lastIdx(){
            return list.size() - 1;
        }
        public static boolean isEmpty() {
            return list.isEmpty();
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty!");
                return -1; // return -1 when stack is empty
            }
            int top = list.get(lastIdx());
            list.remove(lastIdx());
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.get(lastIdx());
        }
    }

    public static void main(String[] args) {
        Stack.push(5);
        Stack.push(8);
        Stack.push(41);

        System.out.println(Stack.pop());  // removes 41
        System.out.println(Stack.peek()); // shows 8
    }
}

