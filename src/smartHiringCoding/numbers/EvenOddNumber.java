package smartHiringCoding.numbers;

public class EvenOddNumber {
    public static void checkEvenOddNumber(int num){
        if(num!=0){
            if(num%2 == 0){
                System.out.println("The number is even");
            }else {
                System.out.println("The number is odd");
            }
        }
    }
    public static void main(String[] args){
        int num = 5;
        checkEvenOddNumber(num);
    }
}
