package smartHiringCoding.numbers;
import java.util.*;

public class AmstrongNumber {
    public static void isAmstrong(int num){
        if(num<10){
            System.out.println("Yes the number is amstrong!");
        } else {
            int temp = num;
            int power = 1;
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while (temp > 10){
                int l = temp%10;
                if(l > 0){
                    power++;
                    list.add(l);
                }
                temp = temp/10;
            }
            list.add(temp);
            for(int i: list){
                sum += Math.pow(i, power);
            }
            if(sum == num){
                System.out.println("Yes the number is an Amstrong number!");
            } else {
                System.out.println("No the number is not an Amstrong number! ");
            }
        }
    }
    public static void main(String[] args){
        int num = 15340;
        isAmstrong(num);
    }
}
