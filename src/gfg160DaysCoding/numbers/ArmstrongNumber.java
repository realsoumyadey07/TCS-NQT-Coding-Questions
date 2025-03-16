package gfg160DaysCoding.numbers;

public class ArmstrongNumber {
    static boolean checkArmstrong(int n){
        int temp = n;
        int length = String.valueOf(n).length();
        double res = 0;
        while (temp>0){
            res+=Math.pow(temp%10, length);
            temp = temp/10;
        }
        System.out.println(res);
        return res == n;
    }
    public static void main(String[] args) {
        int n = 153;
        boolean isArmstrong = checkArmstrong(n);
        System.out.println(isArmstrong);
    }
}
