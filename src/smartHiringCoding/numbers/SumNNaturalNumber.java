package smartHiringCoding.numbers;

public class SumNNaturalNumber {
    public static int sumOfNNaturalNumber(int n){
        if(n==1){
            return 1;
        }else {
            return n + sumOfNNaturalNumber(n-1);
        }
    }
    public static void main(String[] args){
        int n = 10;
        int sum = sumOfNNaturalNumber(n);
        System.out.println("The sum of "+ n + " natural number is: "+ sum);
    }
}
