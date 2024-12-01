package smartHiringCoding.srtings;

import java.util.HashMap;

public class FrequencyOfChar {
    public static void checkFrequencyOfChar(String str){
        HashMap<Character, Integer> list = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ' && list.containsKey(str.charAt(i))) {
                list.put(str.charAt(i), list.get(str.charAt(i))+1);
            } else {
                list.put(str.charAt(i), 1);
            }
        }
        for(Character i: list.keySet()){
            System.out.println("Key "+ i+ " is there for "+ list.get(i)+ " times");
        }
    }
    public static void main(String[] args){
        String str = "Take you forward";
        checkFrequencyOfChar(str);
    }
}
