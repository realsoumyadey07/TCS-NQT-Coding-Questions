package recurssion;

public class FibonacciNumber {
    public static int calculateFibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        System.out.println(n);
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        calculateFibonacci(n);
    }
}
