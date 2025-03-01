package linkedList;

public class CLL {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class CircularLinkedList {
        Node head;
        Node tail;
        private int size;
        public CircularLinkedList(){
            head = tail = null;
            this.size = 0;
        }
        public boolean isEmpty(){
            return this.head == null;
        }
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail =  newNode;
                tail.next = head;
                ++size;
                return;
            }
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
            ++size;
        }
        public void addLast(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                newNode.next = head;
                ++size;
                return;
            }
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
            ++size;
        }
        public void deleteFirst(){
            if(isEmpty()){
                System.out.println("List is empty!");
                return;
            }
            if(head==tail){
                head = tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            --size;
        }
        public void deleteLast() {
            if (isEmpty()) {
                System.out.println("The list is empty!");
                return;
            }
            if (head == tail) {
                head = tail = null;
            } else {
                Node last = head;
                Node secondLast = null;
                while (last.next != head) {
                    secondLast = last;
                    last = last.next;
                }
                secondLast.next = head;
                tail = secondLast;
            }
            --size;
        }
        public void printList(){
            if(isEmpty()){
                System.out.println("List is empty!");
                return;
            }
            System.out.print(head.data+ " -> ");
            Node temp = head.next;
            while (temp!=head){
                System.out.print(temp.data);
                if(temp.next!=head){
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addFirst(1);
        list.deleteLast();
        list.deleteFirst();
        list.printList();
    }
}
