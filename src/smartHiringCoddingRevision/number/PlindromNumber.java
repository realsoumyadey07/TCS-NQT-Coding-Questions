package smartHiringCoddingRevision.number;

public class PlindromNumber {
    static void checkPalindrom(int num){
        int temp = num;
        int result = 0;
        while (temp > 0){
            int s = temp % 10;
            result = (result * 10) + s;
            temp = temp/10;
        }
        if(num == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args){
        int num = 4554;
        checkPalindrom(num);
    }
}
