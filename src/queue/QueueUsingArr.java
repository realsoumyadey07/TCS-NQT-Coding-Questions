package queue;

public class QueueUsingArr {
    static class Queue {
        public int[] arr;
        final int size;
        public int rear = -1;
        public Queue(int n){
            arr = new int[n];
            size = n;
        }
        public boolean isEmpty(){
            return this.rear == -1;
        }
        //enqueue
        public void add(int data){
            if(this.rear == this.size-1){
                System.out.println("Queue is full!");
                return;
            }
            this.rear++;
            this.arr[this.rear] = data;
        }
        //dequeue
        public int remove(){
            if(this.isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            this.rear--;
            return front;
        }
        //peek
        public int peek(){
            if(this.isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
        System.out.println(q.isEmpty());
        System.out.println(q.rear);
        System.out.println(q.size);
        System.out.println(q.peek());
    }
}
