package smartHiringCoddingRevision.string;

public class FindThePositionOfSubstring {
    public static int findThePosition(String str1, String str2){
        return  str1.indexOf(str2);
    }
    public static void main(String[] args){
        String str1 = "takeyouforward";
        String str2 = "forward";
        int position = findThePosition(str1, str2);
        System.out.println(position);
    }
}
