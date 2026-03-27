package Queue;
import java.util.*;
public class QueueReverse {
    public static void reverse(Queue<Integer>q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.add(q.remove());
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        reverse(q);
    }
}
