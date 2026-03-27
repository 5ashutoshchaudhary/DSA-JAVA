package Queue;
import java.util.*;
public class QueueUsingStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }

        void add(int data){
            if(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int remove(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        int peek(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }

        void display(){
            while(!s1.isEmpty()){
                System.out.print(s1.peek() + " ");
                s1.pop();
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(8);
        q.display();
    }
}
