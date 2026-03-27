package Queue;

public class CircularQueueImplementation {
    static class Queue {
       static int arr[];
       static int size;
       static int rear;
       static int front;

       Queue(int n){
           arr = new int[n];
           size = n;
           rear = -1;
           front = -1;
       }

        boolean isEmpty(){
           return rear == -1 && front == -1;
       }

       boolean isFull(){
           return (rear+1)%size == front;
       }

       void add(int data){
           if(isFull()){
               System.out.print("Queue is full");
               return;
           }
           if(front == -1){
               front = 0;
           }
           rear = (rear+1)%size;
           arr[rear] = data;
       }

       int remove(){
           if(isEmpty()){
               System.out.println("Queue is empty");
               return -1;
           }
           int result = arr[front];
           if(rear == front){
               rear = front = -1;
           }else{
               front = (front + 1)%size;
           }
           return result;
       }

       int front(){
           if(isEmpty()){
               System.out.print("Queue is empty");
               return -1;
           }
           return arr[front];
       }
        void display(){
           for(int i = 0; i<=rear; i++){
               System.out.print(arr[i] + " ");
           }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(5);
        q.add(9);
        q.add(5);
        q.display();
    }
}
