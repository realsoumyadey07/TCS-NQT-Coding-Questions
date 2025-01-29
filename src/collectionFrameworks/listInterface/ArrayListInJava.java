package collectionFrameworks.listInterface;
import java.util.ArrayList;
import java.util.Iterator;

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
        list2.add(0, 50);
        list2.addAll(list);
        System.out.println(list2.get(3));
        System.out.println(list2.remove(3));
        System.out.println(list2.contains(50));
        printList(list2);

        //iterator
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
