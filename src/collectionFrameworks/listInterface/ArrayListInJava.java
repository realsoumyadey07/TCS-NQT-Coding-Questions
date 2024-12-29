package collectionFrameworks.listInterface;
import java.util.ArrayList;

public class ArrayListInJava {
    static void printList(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ ", ");
        }
    }
    public static void main(String[] args){
        // heterogeneous data types
        ArrayList list = new ArrayList();
        list.add("Soumya");
        list.add(1);
        list.add(2, 7);
//        printList(list);
        // homogeneous data type
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        printList(list2);
    }
}
