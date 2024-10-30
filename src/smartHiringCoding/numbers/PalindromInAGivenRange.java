package smartHiringCoding.numbers;

public class PalindromInAGivenRange {
    public static boolean isPalindrom(int n){
        if(n<10){
            return true;
        }
        int temp = n;
        int revNum = 0;
        while(temp>0){
            int l = temp%10;
            revNum = (revNum*10)+l;
            temp = temp/10;
        }
        return revNum == n;
    }
    public static void main(String[] args){
        int min = 10;
        int max = 50;
        for(int i=min;i<=max;i++){
            if(isPalindrom(i)){
                System.out.print(i+ ", ");
            }
        }
    }
}
