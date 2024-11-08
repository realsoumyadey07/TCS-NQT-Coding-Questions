package collectionFrameworks.listInterface;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void printList(ArrayList<String> list){
        for(String i: list){
            System.out.println(i);
        }
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args){
                ArrayList<String> list = new ArrayList<>();
                list.add("Soumya Dey");
                list.add("Ram Chandra");
                list.add("Mala Dey");
                list.add("Sajal Dey");
                list.add(4, "Ishani Dey");
                list.add(3, "Ishan dey");
                list.set(3, "Bina Dey");
                System.out.println(list.size());
                list.removeFirst();
                Collections.sort(list);
                list.remove(1);
//                list.clear();
                printList(list);
                System.out.println(list);
    }
}
