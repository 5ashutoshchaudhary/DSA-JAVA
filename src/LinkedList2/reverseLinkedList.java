package LinkedList2;

public class reverseLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList{
        static Node head;
        static Node tail;

        public static void reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next = null;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
}
