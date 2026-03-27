package revision;
import java.util.*;

public class stackImplementation {

    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.isEmpty();
        }

        void push(int data) {
            list.add(data);
        }

        void pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            list.remove(list.size() - 1);
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }

        void display() {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(41);
        s.push(88);
        s.push(77);
        s.pop();
        s.display();
    }
}

