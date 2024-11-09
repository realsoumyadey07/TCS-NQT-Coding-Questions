package smartHiringCoding.numbers;
//a number is called Abundant number when the sum of it's multiples is greater than the number itself.

public class AbundantNumber {
    public static void checkAbundantNumber(int num){
        int sumOfMultiples = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sumOfMultiples+=i;
            }
        }
        if(num < sumOfMultiples){
            System.out.println("Yes the number is Abundant!");
        }else {
            System.out.println("No the number is not Abundant number!");
        }
    }
    public static void main(String[] args){
        int num = 18;
        checkAbundantNumber(num);
    }
}
