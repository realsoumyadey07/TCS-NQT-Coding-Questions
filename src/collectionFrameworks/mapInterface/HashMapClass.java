package collectionFrameworks.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("name", "Soumya");
        student1.put("email", "soumya802@gmail.com");
        student1.put("mobile", "384634543");
        student1.replace("mobile", "6295672996");
//        student1.remove("mobile");
        System.out.println(student1.get("mobile"));
        System.out.println(student1.keySet());
        System.out.println(student1.values());
        System.out.println(student1.size());
        System.out.println(student1.containsKey("mobile"));
//        student1.clear();
        for(String i: student1.keySet()) {
            System.out.println(i);
        }
        for(String i: student1.values()) {
            System.out.println(i);
        }
        for(Map.Entry<String, String> i : student1.entrySet()){
            System.out.println("Key is: "+ i.getKey()+ " and the value is: "+ i.getValue());
        }
    }

}
