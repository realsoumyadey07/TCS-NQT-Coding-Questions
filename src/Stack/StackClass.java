package Stack;

public class StackClass {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static  class Stack {
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void pop(){
            if(isEmpty()){
                System.out.println("The stack is empty!");
                return;
            }
            head = head.next;
        }
        public void peek(){
            if(isEmpty()){
                System.out.println("The stack is empty!");
                return;
            }
            System.out.println(head.data);
        }
    }
    public static void main(String[] args){
        Stack stk = new Stack();
        stk.push(12);
        stk.pop();
        stk.peek();
    }
}
