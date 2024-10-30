package javaClasses;
import java.util.*;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class LamdaFunction {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(4);
        list.add(3);
        list.forEach((n)-> System.out.print(n+ ", "));
        Consumer<Integer> method = (n)-> {
            System.out.println(n);
        };
        StringFunction exclaim = (s)-> s+"!";
        printFormated("Hello", exclaim);
    }
    static void printFormated(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
