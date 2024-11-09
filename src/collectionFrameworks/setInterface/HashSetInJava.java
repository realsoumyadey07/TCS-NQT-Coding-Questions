package collectionFrameworks.setInterface;
import java.util.HashSet;

public class HashSetInJava {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Soumya Dey");
        set.add("Mala Dey");
        set.add("Sajal Dey");
        set.add("Ishani Dey");
        System.out.println(set.contains("Ishani Dey"));
        set.remove("Soumya Dey");
        System.out.println(set);
        System.out.println(set.size());
        for(String i: set){
            System.out.print(i+ ", ");
        }
        set.clear();
    }
}
