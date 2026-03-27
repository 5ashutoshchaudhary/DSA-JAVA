package LinkedList;

public class sec_ALL_IN_ONE {

    public static class LinkedList {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;
        int size = 0;

        // Check if list is empty
        boolean isEmpty() {
            return head == null;
        }

        // Add element at the beginning
        void addFirst(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        // Add element at the end
        void addLast(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        // Display the linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        // Remove the nth node from the end
        void removeNthEnd(int n) {
            if (head == null) return;

            int len = 0;
            Node temp = head;
            while (temp != null) {
                len++;
                temp = temp.next;
            }

            // If removing head
            if (n == len) {
                head = head.next;
                size--;
                if (head == null) tail = null;
                return;
            }

            // Move to node before target
            temp = head;
            for (int i = 1; i < len - n; i++) {
                temp = temp.next;
            }

            // Update tail if needed
            if (temp.next == tail) {
                tail = temp;
            }

            // Remove the target node
            temp.next = temp.next.next;
            size--;
        }

        // Recursive search
        int recSearch(int data) {
            return helper(head, data, 0);
        }

        int helper(Node node, int data, int index) {
            if (node == null) return -1;
            if (node.data == data) return index;
            return helper(node.next, data, index + 1);
        }

        // Iterative reverse
        void reverse() {
            Node prev = null;
            Node curr = head;
            Node next = null;

            tail = head; // old head becomes tail

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev; // new head
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(3);

        ll.display(); // 3->7->6->5->Null

        int idx = ll.recSearch(6);
        if (idx == -1) {
            System.out.println("Element Not found");
        } else {
            System.out.println("Element is found at Index " + idx);
        }

        ll.removeNthEnd(2);
        ll.display(); // 3->7->5->Null

        ll.reverse();
        ll.display(); // 5->7->3->Null
    }
}




