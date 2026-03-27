package LinkedList;

public class nodeFromEnd {
    public static node nthNode(node head,int n){
        int size = 0;
        node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int m = size - n;
        for(int i = 0; i<m-1; i++){
            temp = temp.next;
        }
        node ele = temp;
        temp.next = temp.next.next;
        System.out.println();
        return ele;
    }
    public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        node a = new node(2);
        node b = new node(5);
        node c = new node(4);
        node d = new node(9);
        node e = new node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        node temp = a;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        node result = nthNode(a,2);
        System.out.println("The deleted node is: " + result.data);
    }
}