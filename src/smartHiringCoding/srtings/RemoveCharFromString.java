package smartHiringCoding.srtings;

public class RemoveCharFromString {
    public static void removeCharFromStringAcceptAlpha(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)==' '){
                newStr.append(str.charAt(i));
            }
        }
        System.out.print(newStr);
    }
    public static void main(String[] args){
        String str = "Take you% forward";
        removeCharFromStringAcceptAlpha(str);
    }
}
