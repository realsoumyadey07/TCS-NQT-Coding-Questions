package smartHiringCoding.numbers;

public class PrimeFactors {
    public static void printPrimeFactors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                for(int j=1;j<i;j++){
                    if(j==i && j==1 && i%j==0){
                        System.out.println(j+", ");
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int num = 66;
        printPrimeFactors(num);
    }
}
