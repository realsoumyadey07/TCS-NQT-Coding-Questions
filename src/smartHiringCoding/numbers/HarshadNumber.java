package smartHiringCoding.numbers;
//A number is called harshad number when the number is divisible by its own digits' sum.

public class HarshadNumber {
    public static void checkHarshadNumber(int num){
        int sum=0;
        int temp = num;
        while (temp>0){
            sum+= temp%10;
            temp /=10;
        }
        if(num%sum == 0){
            System.out.println("Yes the number is Harshad number!");
        } else {
            System.out.println("No the number is not harshad number!");
        }
    }
    public static void main(String[] args){
        int num = 378;
        checkHarshadNumber(num);
    }
}
