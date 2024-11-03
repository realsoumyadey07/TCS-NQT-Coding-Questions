package smartHiringCoding.numbers;

public class Factorial {
    public static int printFactorial(int num){
        int factorial = 1;
        for(int i=1; i<=num; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println(printFactorial(num));
    }
}
