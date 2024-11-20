package smartHiringCoding.srtings;

public class Palindrom {
    public static boolean isPalindrom(String str){
        int left = 0, right = str.length()-1;
        while (left<right){
            char l = str.charAt(left), r = str.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }else if (!Character.isLetterOrDigit(r)){
                right--;
            }else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "ABCDCBArgh";
        boolean c = isPalindrom(str);
        if(c){
            System.out.println("Yes the number is a palindrom.");
        } else {
            System.out.println("No the number is not a palindrom.");
        }
    }
}
