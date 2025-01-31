package collectionFrameworks.mapInterface;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("name", "Soumya");
        student1.put("email", "soumya802@gmail.com");
        student1.put("mobile", "384634543");
        student1.remove("mobile");
        System.out.println(student1.get("name"));
        System.out.println(student1.keySet());
        System.out.println(student1.values());
        System.out.println(student1.size());
//        student1.clear();
        for(String i: student1.keySet()) {
            System.out.println(i);
        }
        for(String i: student1.values()) {
            System.out.println(i);
        }
    }

}
