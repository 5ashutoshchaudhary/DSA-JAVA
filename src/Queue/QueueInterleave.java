package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class QueueInterleave {
    public static void Interleave(Queue<Integer>q){
        Queue<Integer> helper = new LinkedList<>();
        int size = q.size();
        if(size%2!=0){
            System.out.println("Number of elements are Odd");
        }
        for(int i = 0; i<size/2; i++){
            helper.add(q.remove());
        }
        while(!helper.isEmpty()){
            q.add(helper.remove());
            q.add(q.remove());
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
        Interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
