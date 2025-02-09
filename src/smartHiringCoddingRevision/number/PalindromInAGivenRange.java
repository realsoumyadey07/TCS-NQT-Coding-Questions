package smartHiringCoddingRevision.number;

public class PalindromInAGivenRange {
    static boolean checkPalindrom(int num){
        int originalNum = num;
        int res = 0;
        while (num>0){
            int temp = num % 10;
            res = 10 * res + temp;
            num = num / 10;
        }
        return originalNum == res;
    }
    static void printPalindromInARange(int range){
        for(int i=0;i<range;i++){
            if(checkPalindrom(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int range = 50;
        printPalindromInARange(range);
    }
}
