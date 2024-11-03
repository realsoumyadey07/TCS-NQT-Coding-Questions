package recurssion;

public class FibonacciNumber {
    public static int calculateFibonacci(int n){
        // base condition
        if(n < 2){
            return n;
        }
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(calculateFibonacci(n));
    }
}
