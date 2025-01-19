package ArushsDSASheet.numbers;

public class Palindrom {
    static void checkPalindrom(int num){
        if(num/10<0){
            System.out.println("Yes the number is palindrom");
        }
        int temp = num;
        int reverceNum = 0;
        while (temp > 0){
            int t = temp % 10;
            reverceNum = reverceNum * 10 + t;
            temp = temp / 10;
        }
        if(reverceNum == num){
            System.out.println("Yes the number is palindrom");
        } else {
            System.out.println("No the number is not a palindrom");
        }
    }
    public static void main(String[] args){
        int num = 10011;
        checkPalindrom(num);
    }
}
