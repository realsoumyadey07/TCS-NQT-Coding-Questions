package linkedList;

public class CDLL {
    static class Node {
        String data;
        Node prev;
        Node next;
        public Node(String data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    static class CircularDoublyLinkedList {
        Node head;
        Node tail;
        private int size;
        public CircularDoublyLinkedList(){
            this.size = 0;
            this.head = null;
            this.tail = null;
        }
        public boolean isEmpty(){
            return head == null;
        }
        public int getSize(){
            return size;
        }
        public void addFirst(String data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = tail = newNode;
                head.next = head;
                head.prev = head;
            } else {
                newNode.next = head;
                newNode.prev = tail;
                tail.next = newNode;
                head.prev = newNode;
                head = newNode;
            }

            ++size;
        }
        public void addLast(String data){
            Node newNode = new Node(data);
            if (isEmpty()){
                newNode.next = head;
                newNode.prev = head;
                head = tail = newNode;
            }else {
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = head;
                tail = newNode;
                head.prev = newNode;
            }
            ++size;
        }
        public void deleteFirst(){
            if(isEmpty()){
                System.out.println("List is empty!");
            }else {
                head.next.prev = tail;
                tail.next = head.next;
                head = head.next;
                --size;
            }
        }
        public void deleteLast(){
            if(isEmpty()){
                System.out.println("List is empty!");
            } else {
                tail.prev.next = head;
                head.prev = tail.prev.next;
                tail = tail.prev;
                --size;
            }
        }
        public void printList(){
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
    }
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.addFirst("soumya");
        list.addFirst("tanmoy");
        list.addFirst("samay");
        list.addLast("Ishan");
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println("\nThe lengeth of the list is: "+ list.getSize());
    }
}
