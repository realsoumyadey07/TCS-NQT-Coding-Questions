package smartHiringCoding.numbers;

public class SumOfGPSeries {
    public static void calculateSumOfGpSeries(double a, double r, int n){
        double sum = 0;
        for(int i=0;i < n; i++){
            sum += a;
            a = a * r;
        }
        System.out.println("Sum of AP series is: "+ sum);
    }
    public static void main(String[] args){
        double a = 3;
        double r = 5;
        int n = 2;
        calculateSumOfGpSeries(a, r, n);
    }
}
