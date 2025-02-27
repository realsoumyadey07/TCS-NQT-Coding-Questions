package linkedList;

public class DLL {
    static class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    static class DoublyLinkedList {
        Node head;
        private int size;
        DoublyLinkedList(){
            this.size = 0;
        }
        public boolean isEmpty(){
            return this.head == null;
        }
        public int getSize(){
            return this.size;
        }
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                ++size;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            ++size;
        }
        public void addLast(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                ++size;
                return;
            }
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            ++size;
        }
        public void deleteFirst(){
            if(isEmpty()){
                System.out.println("Linkedlist is empty!");
                --size;
                return;
            }
            head = head.next;
            head.next.prev = null;
            --size;
        }
        public void deleteLast(){
            if(isEmpty()){
                System.out.println("Linkedlist is empty!");
                return;
            }
            if(head.next==null){
                head = null;
                --size;
                return;
            }
            Node last = head.next;
            while (last.next!=null){
                last = last.next;
            }
            last.prev.next = null;
            --size;
        }
        public void printList(){
            if(isEmpty()){
                System.out.println("Linkedlist is empty!");
                return;
            }
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data);
                if(temp.next!=null){
                    System.out.print("-> ");
                }
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println("\nThe size is: "+list.getSize());
    }
}
