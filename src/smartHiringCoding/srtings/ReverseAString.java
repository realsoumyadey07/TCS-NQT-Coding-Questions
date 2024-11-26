package smartHiringCoding.srtings;

public class ReverseAString {
    public static void reverseTheString(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            newStr.append(str.charAt(i));
        }
        System.out.println(newStr.toString());
    }
    public static void main(String[] args){
        String str = "Hello, World!";
        reverseTheString(str);
    }
}
