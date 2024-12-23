package smartHiringCoddingRevision.string;

public class ChangeTheCase {
    static String reverseTheCase(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                newStr.append(Character.toLowerCase(ch));
            } else {
                newStr.append(Character.toUpperCase(ch));
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args){
        String str = "javA";
        String newStr = reverseTheCase(str);
        System.out.println(newStr);
    }
}
