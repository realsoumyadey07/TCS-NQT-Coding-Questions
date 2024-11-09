package smartHiringCoding.numbers;

public class SumOfDigits {
    public static  void calculateSumOfDigits(int num){
        int sum = 0;
        while (num>0){
            sum += num%10;
            num/=10;
        }
        System.out.println("The sum of the digits is: "+ sum);
    }
    public static void main(String[] args){
        int num = 456;
        calculateSumOfDigits(num);
    }
}
