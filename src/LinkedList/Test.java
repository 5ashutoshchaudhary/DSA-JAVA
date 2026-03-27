package LinkedList;
public class Test {
    public static class LinkedList {
        public static class Node {
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

        boolean hasCycle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        void removeCycle(){
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next;

                if(slow == fast){
                    cycle = true;
                    return;
                }
            }
            if(cycle == false){
                return;
            }
            Node prev = null;
            while(slow != fast){
                prev = fast;
                fast = fast.next;
                slow = slow.next;
            }
            prev.next = null;
        }

        void print() {
            Node temp = head;
            int count = 0;

            while (temp != null && count < size) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(8);
        ll.addFirst(10);
        ll.print();
    }
}
