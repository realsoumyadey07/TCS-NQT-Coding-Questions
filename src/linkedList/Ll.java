package linkedList;

public class Ll {
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;
        private int size;

        public LinkedList() {
            this.head = null;
            this.size = 0;
        }

        // Check if the list is empty
        public boolean isEmpty() {
            return this.head == null;
        }

        // Add element at the beginning
        public void addFirst(String data) {
            Node newNode = new Node(data);
            if (this.isEmpty()) {
                this.head = newNode;
                ++this.size;
                return;
            }
            newNode.next = this.head;
            this.head = newNode;
            ++this.size;
        }

        // Add element at the end
        public void addLast(String data) {
            Node newNode = new Node(data);
            if (this.isEmpty()) {
                this.head = newNode;
                ++this.size;
                return; // Fix: Prevent further execution
            }
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            ++this.size; // Fix: Increment size correctly
        }

        // Delete the first element
        public void deleteFirst() {
            if (this.isEmpty()) {
                System.out.println("List is empty!");
                return; // Fix: Prevent further execution
            }
            this.head = this.head.next;
            --this.size;
        }

        // Delete the last element
        public void deleteLast() {
            if (this.isEmpty()) {
                System.out.println("List is empty!");
                return; // Fix: Prevent further execution
            }
            if (this.head.next == null) {
                this.head = null;
                --this.size;
                return;
            }
            Node secondLast = this.head;
            Node lastNode = this.head.next;
            while (lastNode.next != null) {
                secondLast = secondLast.next;
                lastNode = lastNode.next;
            }
            secondLast.next = null;
            --this.size;
        }

        // Print the list
        public void printList() {
            if (this.isEmpty()) {
                System.out.println("List is empty!"); // Improvement
                return;
            }
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");

        list.deleteFirst();
        list.deleteLast();

        System.out.println("Size of the linked list is: " + list.size);
        list.printList();
    }
}
