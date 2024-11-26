package smartHiringCoding.srtings;

public class SumOfTheDigitsInString {
    public static void calculateTheSum(String str){
        String temp = "0";
        int result = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            } else {
                result += Integer.parseInt(temp);
                temp = "0";
            }
        }
        result+=Integer.parseInt(temp);
        System.out.println("The sum is: "+ result );
    }
    public static void main(String[] args){
        String str = "Take15 you forwar1d 278";
        calculateTheSum(str);
    }
}
