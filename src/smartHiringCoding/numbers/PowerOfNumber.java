package smartHiringCoding.numbers;
import java.math.BigInteger;

public class PowerOfNumber {
    public static void powerOfANumber(int N, int r){
            BigInteger power = BigInteger.ONE;
            BigInteger base = BigInteger.valueOf(N);
            for(int i=0;i<r;i++){
                power = power.multiply(base);
            }
            System.out.println("Answer is: "+ power);

    }
    public static void main(String[] args) {
        int N = 14;
        int r = 41;
        powerOfANumber(N, r);
    }
}
