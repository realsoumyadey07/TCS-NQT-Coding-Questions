package smartHiringCoding.numbers;

public class Replace0With1 {
    public static void remove0With1(int num){
        int removedNum = 0, temp = 1;
        while (num>0){
            int l = num%10;
            if(l==0){
                l = 1;
            }
            removedNum = l * temp + removedNum;
            num = num/10;
            temp*=10;
        }
        System.out.println(removedNum);
    }
    public static void main(String[] args){
        int num = 100200;
        remove0With1(num);
    }
}
