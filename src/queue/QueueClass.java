package queue;

public class QueueClass {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static class Queue {
        public static Node front;
        public static Node rear;
        public static int size;
        public static boolean isEmpty(){
            return front == null;
        }
        public static void enqueue(int data) {

        }
    }
    public static void main(String[] args){

    }
}
