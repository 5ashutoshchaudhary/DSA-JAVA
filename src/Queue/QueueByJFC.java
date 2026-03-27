package Queue;
import java.util.*;
public class QueueByJFC {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        while(!list.isEmpty()){
            System.out.print(list.peek() + " ");
            list.remove();
        }
    }
}
