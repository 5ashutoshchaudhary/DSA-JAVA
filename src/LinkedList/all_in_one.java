package LinkedList;

public class all_in_one {

    public static class LinkedList {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static Node head = null;
        static Node tail = null;
        static int size = 0;

        boolean isEmpty() {
            return head == null;
        }

        void addFirst(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                size++;
                return;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }

        void addLast(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                size++;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        void size() {
            System.out.println("Size of LinkedList = " + size);
        }

        void removeFirst() {
            if (isEmpty()) {
                System.out.println("LinkedList is Empty");
                return;
            }

            if (head == tail) {
                head = tail = null;
                size--;
                return;
            }

            head = head.next;
            size--;
        }

        void removeLast() {
            if (isEmpty()) {
                System.out.println("LinkedList is Empty");
                return;
            }

            if (head == tail) {
                head = tail = null;
                size--;
                return;
            }

            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
            size--;
        }
        void searchIndex(int data){
            Node temp = head;
            int count = 0;
            while(temp != null){
                if(temp.data == data){
                    System.out.println("Found at Index: " + count);
                    return;
                }
                temp = temp.next;
                count++;
            }
            System.out.print(" Element Not found");
        }

        void zigzag(){
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node left = head;
            Node right = prev;
            Node nextL,nextR;

            while(left != null && right != null){
                nextL = left.next;
                nextR = right.next;
                left.next = right;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(74);
        ll.addFirst(73);
        ll.addFirst(72);
        ll.addFirst(71);
        ll.addLast(85);
        ll.addLast(96);

        ll.display();
        ll.zigzag();
        ll.display();

    }
}

