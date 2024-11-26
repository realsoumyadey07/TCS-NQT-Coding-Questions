package smartHiringCoding.srtings;

public class RemoveBrackets {
    public static void removeBrackets(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='(' && str.charAt(i)!=')'){
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr.toString());
    }
    public static void main(String[] args){
        String str = "a+((b-c)+d)";
        removeBrackets(str);
    }
}
