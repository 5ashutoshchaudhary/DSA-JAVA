package Queue;

public class Revision {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

         boolean isEmpty(){
            return rear == -1;
        }

        void add(int data){
            if(rear == size-1){
                System.out.print("Queue is full");
                return;
            }
            arr[++rear] = data;
            size++;
        }

        int remove(){
            if(isEmpty()){
                System.out.print("Stack is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            size--;
            return front;
        }

        int front(){
            if(isEmpty()){
                System.out.print("Stack is Empty");
                return -1;
            }
            return arr[0];
        }

        void display(){
            for(int i = 0; i<rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(5);
        q.add(8);
        q.add(9);
        q.add(74);
        q.add(36);
        q.display();
        q.remove();
        q.display();
    }
}
