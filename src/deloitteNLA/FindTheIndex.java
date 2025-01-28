package deloitteNLA;

public class FindTheIndex {
    static int checkTheFirstIndex(String str, String target) {
        return str.indexOf(target);
    }
    public static void main(String[] args) {
        String str = "hdhdsadbutsad";
        String target = "sad";
        int firstIndex = checkTheFirstIndex(str, target);
        System.out.println(firstIndex);
    }
}
