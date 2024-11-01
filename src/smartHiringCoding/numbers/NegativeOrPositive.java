package smartHiringCoding.numbers;

public class NegativeOrPositive {
    public static void checkNum(int num){
        if(num>0){
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }
    }
    public static void main(String[] args){
        int num = -1;
        checkNum(num);
    }
}
