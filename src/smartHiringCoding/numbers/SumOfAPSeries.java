package smartHiringCoding.numbers;

public class SumOfAPSeries {
    public static void printAPSeries(int a, int d, int n){
        if(a!=n){
            int sum =0;
            int count =0;
            int i = a;
            while (count < n){
                sum+=i;
                i=i+d;
                count++;
            }
            System.out.print("The sum is: "+ sum);
        }
    }
    public static void main(String[] args){
        int a = 2;
        int d = 2;
        int n = 4;
        printAPSeries(a, d, n);
    }
}
