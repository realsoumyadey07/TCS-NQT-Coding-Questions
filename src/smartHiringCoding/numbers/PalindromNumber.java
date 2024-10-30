package smartHiringCoding.numbers;

public class PalindromNumber {
    public static boolean isPalindrom(int n){
        if((n/10)<0){
            return true;
        }
        int temp = n;
        int revNum = 0;
        while (temp>0){
            int l = temp%10;
            revNum = (revNum*10)+l;
            temp = temp/10;
        }
        if(revNum == n){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        int n = 1111;
        System.out.println(isPalindrom(n));
    }
}
