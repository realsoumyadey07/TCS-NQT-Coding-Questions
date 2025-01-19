package ArushsDSASheet.strings;

public class Palindrom {
    static void checkPalindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("No the number is not palindrom!");
                return;
            }
        }
        System.out.println("Yes the number is palindrom");
    }
    public static void main(String[] args){
        String str = "suus";
        checkPalindrom(str);
    }
}
