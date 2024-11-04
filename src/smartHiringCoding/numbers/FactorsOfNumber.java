package smartHiringCoding.numbers;
public class FactorsOfNumber {
    public static void printFactors(int num){
        if(num!=0){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+ ", ");
                }
            }
        }
    }
    public static void main(String[] args){
        int num = 6;
        printFactors(num);
    }
}
