package smartHiringCoding.numbers;

public class StrongNumber {
    public static void checkStrongNumber(int num){
        if(num>10){
            int temp = num;
            int sum = 0;
            while (num>0){
                int l = num%10;
                int firstFactorial = 1;
                for(int i=1;i<=l;i++){
                    firstFactorial = firstFactorial*i;
                }
                sum = sum+firstFactorial;
                num = num/10;
            }
            if(temp == sum){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public static void main(String[] args){
        int num = 145;
        checkStrongNumber(num);
    }
}
