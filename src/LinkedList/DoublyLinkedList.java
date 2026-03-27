package LinkedList;

public class DoublyLinkedList {
    public static class doublyLinkedList{
        public static class Node{
            int data;
            Node next = null;
            Node previous = null;

            Node(int data){
                this.data = data;
                this.next = null;
                this.previous = null;
            }
        }
        Node head = null;
        Node tail = null;
        int size = 0;

        boolean isEmpty(){
            return head == null;
        }

        void addFirst(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                size++;
                return;
            }
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            size++;
        }

        void removeFirst(){
            if(isEmpty()){
                System.out.print("LinkedList is empty");
                return;
            }
            if(size == 1){
                head = tail = null;
                size--;
            }
            head = head.next;
            head.previous = null;
            size--;
        }

        void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        int size(){
            return size;
        }

        void reverse(){
            Node curr = head;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.previous = next;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.addFirst(8);
        dll.addFirst(2);
        dll.addFirst(9);
        dll.addFirst(3);
        dll.addFirst(7);
        dll.print();
        dll.removeFirst();
        dll.reverse();
        dll.print();
        System.out.println(dll.size());
    }
}
