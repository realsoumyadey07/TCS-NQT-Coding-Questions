package collectionFrameworks.listInterface;

import java.util.Stack;

public class StackListInJava {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Tiger");
        System.out.println(animals.pop());
        System.out.println(animals.peek());
    }
}
