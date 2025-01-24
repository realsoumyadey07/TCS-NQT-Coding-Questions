package deloitteNLA;

public class SumOfOddEventNum {
    static void calTheSumOfOddEvenNum(int[] list){
        int odd = 0;
        int even = 0;
        for(int i=0; i<list.length;i++){
            if(list[i]%2 == 0){
                even+= list[i];
            } else {
                odd+= list[i];
            }
        }
        System.out.println("Odd is: "+ odd+ "\nand even is: "+ even);
    }
    public static void main(String[] args){
        int[] list = {1, 5, 2, 8, 9, 3, 7};
        calTheSumOfOddEvenNum(list);
    }
}
