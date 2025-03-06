package queue;

public class CircularQueue {
    static class Queue {
        public int[] arr;
        final int size;
        public int rear = -1;
        public int front = -1;
        public Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        public boolean isEmpty(){
            return this.rear == -1 && this.front == -1;
        }
        public boolean isFull(){
            return (this.rear+1) % this.size == this.front;
        }
        //enqueue
        public void add(int data){
            if(this.rear == this.size-1){
                System.out.println("Queue is full!");
                return;
            }
            this.rear = (this.rear+1)%this.size;
            this.arr[this.rear] = data;
        }
    }
    public static void main(String[] args) {

    }
}
