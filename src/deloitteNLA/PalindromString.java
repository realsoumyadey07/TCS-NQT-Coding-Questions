package deloitteNLA;

public class PalindromString {
    static void checkPalindrom(String str) {
        StringBuilder newStr = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            newStr.append(str.charAt(i));
        }
        System.out.println(newStr);
        if (newStr.toString().equals(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        String str = "naan";
        checkPalindrom(str);
    }
}
