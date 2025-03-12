package queue;

public class UsingLinkedList {
    static class Node {
        public int data;
        public Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        public Node head;
        public Node rear;
        private int size;
        public Queue(){
            this.head = this.rear = null;
        }
        public boolean isEmpty(){
            return this.head == null && this.rear == null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                this.head = this.rear = newNode;
                ++this.size;
                return;
            }
            this.rear.next = newNode;
            this.rear = newNode;
            ++this.size;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("The queue is empty!");
                return -1;
            }
            if(this.head == this.rear){
                int data = this.head.data;
                this.head = this.rear = null;
                --this.size;
                return data;
            }
            int data = this.head.data;
            this.head = this.head.next;
            --this.size;
            return data;
        }
        public void printQueue(){
            if(isEmpty()) System.out.println("Queue is empty!");
            Node temp = this.head;
            while (temp!=null){
                System.out.print(temp.data);
                temp = temp.next;
                if(temp!=null) System.out.print(" -> ");
            }
        }
    }
    public static void main(String[] args) {
        Queue list = new Queue();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int removedData = list.remove();
        list.printQueue();
        System.out.println("\nRemoved data is: "+ removedData);
    }
}
