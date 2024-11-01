package smartHiringCoding.numbers;
import java.util.*;

public class PerfectNumber {
    public static void checkPerfectNumber(int num){
        if(num>0){
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
            if(num == sum){
                System.out.println("Yes the number is Perfect!");
            }else {
                System.out.println("No the number is not Perfect!");
            }
        }
    }
    public static void main(String[] args) {
        int num = 28;
        checkPerfectNumber(num);
    }
}
