package smartHiringCoding.numbers;

public class PrimeNumber {
    public static void checkPrimeNumber(int num){
        if(num == 0 || num == 1){
            System.out.println("No number is not a prime number!");
            return;
        }
        boolean isDivisible = false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(i!=num && num%i == 0){
                isDivisible = true;
                System.out.println("No number is not prime!");
            }

        }
        if(!isDivisible){
            System.out.println("Yes the number is prime number");
            return;
        }
    }
    public static void main(String[] args){
        int num = 2;
        checkPrimeNumber(num);
    }
}
