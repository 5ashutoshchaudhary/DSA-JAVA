package LinkedList;

public class Methods {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int getAt(int idx){
            if(idx<0 || idx>=length()){
                System.out.print("invalid Index");
                return -1;
            }
            Node temp = head;
            for(int i = 0; i<=idx; i++){
                temp = temp.next;
            }
            System.out.println();
            return temp.data;
        }
        void Push(int val){
            Node temp = new Node(val);
            if( head == null){
                head = temp;
                tail = temp;
            }else{
            tail.next = temp;
            tail = temp;
            }
        }
        void Unshift(int val){
            Node temp = new Node(val);
            if( head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            System.out.println();
        }
        void Insert(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == length()){
                Push(val);
                return;
            }
            if(idx==0){
                Unshift(val);
                return;
            }
            for(int i = 0; i<=idx; i++){
                t.next = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            System.out.println();
        }
        void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int length(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                temp = temp.next;
                count++;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Push(5);
        ll.Push(10);
        ll.Push(15);
        ll.Push(20);
        ll.Push(30);
        ll.print();
        ll.length();
        ll.Unshift(88);
        ll.print();
        ll.Insert(1,500);
        ll.print();
        System.out.println(ll.getAt(77));
    }
}
