package Queue;
import java.util.*;
public class QueueUsingLinkedList {
    public static class Queue{
       static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        static Node head = null;
        static Node tail = null;

        boolean isEmpty(){
            return head == null;
        }

         void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        int remove(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else {
                head = head.next;
            }
            return front;
        }

        int peak(){
            if(isEmpty()){
                System.out.print("Stack is Empty");
                return -1;
            }
            return head.data;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(6);
        q.display();
    }
}
