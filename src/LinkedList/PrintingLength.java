package LinkedList;

public class PrintingLength {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void Display(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        System.out.println();
        System.out.print("The length of LinkedList Is : " + count);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(30);
        Node e = new Node(35);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Display(a);
    }
}
