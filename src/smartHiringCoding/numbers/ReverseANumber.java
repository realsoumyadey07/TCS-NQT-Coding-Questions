package smartHiringCoding.numbers;

public class ReverseANumber {
    public static int reverseTheNumber(int num){
        if(num>10){
            int temp = 1;
            int reversed = 0;
            while (num>0) {
                temp = num % 10;
                reversed = (reversed*10) + temp;
                num = num/10;
            }
            return reversed;
        }else {
            return num;
        }
    }
    public static void main(String[] args) {
        int num = 194;
        System.out.println(reverseTheNumber(num));
    }
}
