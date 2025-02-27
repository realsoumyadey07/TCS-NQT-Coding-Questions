package linkedList;

public class CLL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class CircularLinkedList {
        Node head;
        private int size;
        CircularLinkedList(){
            this.size = 0;
        }
        public boolean isEmpty(){
            return this.head == null;
        }
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                newNode.next = head;
                ++size;
                return;
            }
            newNode.next = head;
            head = newNode;
            ++size;
        }
    }
    public static void main(String[] args) {

    }
}
