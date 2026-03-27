package revision;

public class stackUsingLinkedList {
    public static class Stack{
         static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        Node head = null;
         boolean isEmpty(){
             return head == null;
         }
         void push(int data){
             Node newNode = new Node(data);
             if(isEmpty()){
                 head = newNode;
                 return;
             }
                 newNode.next = head;
                 head = newNode;
         }
         void pop(){
             if(isEmpty()){
                 System.out.print("Stack is empty");
                 return;
             }
             head = head.next;
         }

         int peek(){
             if(isEmpty()){
                 System.out.print("Stack is empty");
                 return -1;
             }
             return head.data;
         }

         void display(){
             Node temp = head;
             while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(6);
        s.push(8);
        s.display();
        s.pop();
        s.display();
    }
}
