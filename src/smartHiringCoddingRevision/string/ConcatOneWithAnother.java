package smartHiringCoddingRevision.string;

public class ConcatOneWithAnother {
    static String concateAll(String str){
        return str.replace(" ", "");
    }
    public static void main(String[] args){
        String str = "Hello Wrold!";
        String newStr = concateAll(str);
        System.out.println(newStr);
    }
}
