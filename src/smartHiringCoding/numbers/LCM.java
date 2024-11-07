package smartHiringCoding.numbers;

public class LCM {
    public static void findLCM(int num1, int num2){
        int lcm = 1;
        int i = 1;
        while (num1>0 || num2>0){
            if(num1%i==0 || num2%1==0){
                lcm*=i;
            }

        }
    }
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 8;
        findLCM(num1, num2);
    }
}
