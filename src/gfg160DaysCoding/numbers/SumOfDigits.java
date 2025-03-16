package gfg160DaysCoding.numbers;

public class SumOfDigits {
    static int calSumOfDigits(int num){
        int sum = 0;
        int temp = num;
        while (temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 12;
        int sum = calSumOfDigits(num);
        System.out.println(sum);
    }
}
