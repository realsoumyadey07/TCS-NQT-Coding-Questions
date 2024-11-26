package smartHiringCoding.srtings;

public class RemoveSpaces {
    public static String removeAllSpaces(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        String str = "Take you forward";
        String newStr = removeAllSpaces(str);
        System.out.println(newStr);
    }
}
