package smartHiringCoding.numbers;

public class Automorphic {
    static void isAutomorphic(int num){
        int sq = num * num;
        while (num>0){
            if(num%10!=sq%10){
                System.out.println("No it is not an automorphic number");
                return;
            }
            num = num/10;
            sq = sq/10;
        }
        System.out.println("Yes it is an automorphic number");
    }
    public static void main(String[] args){
        int num = 70;
        isAutomorphic(num);
    }
}
