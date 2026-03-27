package LinkedList;

public class isPelindrome {
    public static class LinkedList {

        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;

        boolean isEmpty() {
            return head == null;
        }

        void addFirst(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        Node Mid(){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        boolean CheckPelindrome(){
            if(head == null || head.next == null){
                return true;
            }
            Node MidNode = Mid();

            Node prev = null;
            Node curr = MidNode;
            Node next = null;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;
            Node left = head;

            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(9);
        ll.display();   // 5->6->5->Null
        if(ll.CheckPelindrome()){
            System.out.print("LinkedList is pelindrome");
        }else{
            System.out.println("Not pelindrome");
        }
    }
}

