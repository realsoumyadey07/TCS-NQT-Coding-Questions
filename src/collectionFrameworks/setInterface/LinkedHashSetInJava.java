package collectionFrameworks.setInterface;
import java.util.LinkedHashSet;

public class LinkedHashSetInJava {
    public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Kolkata");
        linkedHashSet.add("Bangalore");
        linkedHashSet.add("Mumbai");
        System.out.println(linkedHashSet.contains("Kolkata"));
        for(String i: linkedHashSet){
            System.out.println(i+", ");
        }
        linkedHashSet.remove("Kolkata");
        linkedHashSet.clear();
    }
}
