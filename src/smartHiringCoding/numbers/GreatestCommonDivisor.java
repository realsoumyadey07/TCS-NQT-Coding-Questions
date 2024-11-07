package smartHiringCoding.numbers;

public class GreatestCommonDivisor {
    public static void findGreatestCommonDivisor(int num1, int num2){
        int max = Math.max(num1, num2);
        int maxCommonDivisor = 0;
        for(int i=1; i<max; i++){
            if(num1%i == 0 && num2%i == 0){
                if(i>maxCommonDivisor){
                    maxCommonDivisor = i;
                }
            }
        }
        System.out.println("The greatest common divisor is: "+ maxCommonDivisor);
    }
    public static void main(String[] args){
        int num1 = 9;
        int num2 = 12;
        findGreatestCommonDivisor(num1, num2);
    }
}
