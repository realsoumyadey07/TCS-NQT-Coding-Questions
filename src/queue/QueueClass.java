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
        public static Node head;
        public static Node last;
        public static boolean isEmpty(){
            return head == null;
        }
    }
    public static void main(String[] args){

    }
}
