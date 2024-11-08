package collectionFrameworks.listInterface;
import java.util.LinkedList;


public class LinkedListInJava {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Soumya Dey");
        list.addFirst("Mala Dey");
        list.addFirst("Sajal Dey");
        list.addLast("Ishani Dey");
        list.removeFirst();
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
