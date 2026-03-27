package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class DS_Deque {
    public static void main(String[] args) {
        Deque<Integer>d = new LinkedList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println(d);
        d.addFirst(100);
        System.out.println(d);
        d.addLast(500);
        System.out.println(d);
        System.out.println(d.getFirst() + " " + d.getLast());
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
