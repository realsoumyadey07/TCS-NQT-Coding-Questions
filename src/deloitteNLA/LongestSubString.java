package deloitteNLA;

public class LongestSubString {
    static int calLongestSubStrLength(String str) {
        int res = 0;
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(!newStr.toString().contains(String.valueOf(str.charAt(i)))) {
                newStr.append(str.charAt(i));
                res++;
            } else {
                res = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = calLongestSubStrLength(str);
        System.out.println(length);
    }
}
