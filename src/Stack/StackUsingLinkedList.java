package Stack;

public class StackUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void Push(int val){
            Node newNode = new Node(val);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int Pop(){
            if(isEmpty()){
                System.out.print("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int Peek(){
            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack.Push(8);
        Stack.Push(9);
        Stack.Push(10);
        System.out.println(Stack.Pop());
        System.out.println(Stack.Pop());
        System.out.println(Stack.Peek());
    }
}
