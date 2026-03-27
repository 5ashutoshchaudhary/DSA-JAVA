package LinkedList2;

public class Basics {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList {
        public Node head;
        public Node tail;
        public int size;

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public void addAtFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;

            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void Print() {
            Node temp = head;
            if (temp == null) {
                System.out.print("LinkedList is Empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }

        public void insertAtIndex(int idx, int data) {
            if (idx == 0) {
                addAtFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        public int removeFirst() {
            if (size == 0) {
                System.out.print("LinkedList is Empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {
            if (size == 0) {
                System.out.print("LinkedList is Empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        public int Search(int key) {
            Node temp = head;
            int i = 0;

            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }

        public void reverse() {
            Node prev = null;
            Node curr = head;
            Node next = null;

            tail = head;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        public int FindAndDelete(int key){
            Node prev = head;
            Node curr = head.next;

            if(head == null){
                System.out.print("List is empty..");
                return Integer.MIN_VALUE;
            }

            if(head.data == key){
                return removeFirst();
            }

            while(curr != null){
                if(curr.data == key){
                    if(curr == tail){
                        tail = prev;
                    }
                    prev.next = curr.next;
                    size--;
                    return curr.data;
                }
                prev = curr;
                curr = curr.next;
            }
            System.out.println("Key nhi mila...");
            return Integer.MIN_VALUE;
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.insertAtEnd(5);
            ll.insertAtEnd(6);
            ll.addAtFirst(8);
            ll.addAtFirst(9);
            ll.insertAtEnd(88);
            ll.Print();
            ll.insertAtIndex(2, 100);
            System.out.println();
            ll.Print();
            System.out.println();
            System.out.println(ll.removeFirst());
            ll.Print();
            System.out.println();
            ll.removeLast();
            ll.Print();
            ll.reverse();
            System.out.println();
            ll.Print();
            ll.Print();
            System.out.println(ll.FindAndDelete(100));
            ll.Print();
        }
    }
}
