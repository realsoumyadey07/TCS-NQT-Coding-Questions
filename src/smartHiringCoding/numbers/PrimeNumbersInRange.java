package smartHiringCoding.numbers;

public class PrimeNumbersInRange {
    public static int primeNumbersInGivenRange(int num){
        if(num>=2){
            boolean isDivisible = false;
            for(int i=2;i<Math.sqrt(num);i++){
                if(i!=num && num%i==0){
                    isDivisible = true;
                }
            }
            if(!isDivisible){
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int min = 10;
        int max = 20;
        for(int i=min; i<=max;i++){
            int primeNum = primeNumbersInGivenRange(i);
            if(primeNum!=0){
                System.out.println(primeNum+ ", ");
            }

        }

    }
}
