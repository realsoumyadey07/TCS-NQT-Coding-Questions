package smartHiringCoding.numbers;

public class FibonnaciSeries {
    public static int printFibonnaciSeries(int n){
        if(n==1 || n==2){
            return 1;
        } else {
            return printFibonnaciSeries(n-1)+ printFibonnaciSeries(n-2);
        }
    }
    public static void main(String[] args){
        int n = 5;
        for(int i=0;i<n;i++){
            System.out.print(printFibonnaciSeries(i)+ ", ");
        }
    }
}
