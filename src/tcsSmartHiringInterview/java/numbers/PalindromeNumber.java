package tcsSmartHiringInterview.java.numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 4554;
        int res = num;
        int temp = 0;
        while(num > 0){
            int t = num % 10;
            temp = temp * 10 + t;
            num/=10;
        }
        if(temp == res){
            System.out.println("yes the number is palindrome");
        }else {
            System.out.println("No the number is not a palindrome");
        }
    }
}
