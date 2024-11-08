package collectionFrameworks.listInterface;
import java.util.Vector;

public class VectorsInJava {
    public static void printVerctors(Vector<String> vector){
        for(String i: vector){
            System.out.print(i+", ");
        }
    }
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("Soumya Dey");
        vector.add("Mala Dey");
        vector.add("Sajal Dey");
        System.out.println(vector.size());
        System.out.println(vector.get(1));
        System.out.println(vector.getFirst());
        System.out.println(vector.remove(1));
        System.out.println(vector.removeFirst());
        System.out.println(vector.isEmpty());
        printVerctors(vector);
    }
}
