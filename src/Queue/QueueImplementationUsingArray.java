package Queue;
import java.util.*;
public class QueueImplementationUsingArray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear==arr.length-1){
                System.out.print("Queue is full...");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int  remove(){
            if(isEmpty()){
                System.out.print("Array is empty...");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty...");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(5);
        q.add(6);
        q.add(9);
        q.add(3);
        q.add(10);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
