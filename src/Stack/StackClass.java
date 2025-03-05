package Stack;

public class StackClass {
    static class Node {
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        public Node head;
        private int size;
        public int getSize(){
            return this.size;
        }
        public boolean isEmpty(){
            return this.head == null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(this.isEmpty()){
                head = newNode;
                ++this.size;
                return;
            }
            newNode.next = head;
            head = newNode;
            ++this.size;
        }
        public int pop(){
            if(this.isEmpty()){
                System.out.println("The stack is empty!");
                return 0;
            }
            int data = head.data;
            head = head.next;
            return data;
        }
        public void printStack(){
            if(this.isEmpty()){
                System.out.println("Stack is empty!");
                return;
            }
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public int peek(){
            if(this.isEmpty()){
                System.out.println("Stack is empty!");
                return 0;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack stk1 = new Stack();
        stk1.push(12);
        stk1.push(11);
        stk1.push(10);
        stk1.printStack();
        System.out.println(stk1.peek());
    }
}
