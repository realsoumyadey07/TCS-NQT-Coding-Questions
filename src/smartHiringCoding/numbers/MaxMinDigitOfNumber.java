package smartHiringCoding.numbers;

import java.sql.Array;

public class MaxMinDigitOfNumber {
    public static void findMinMaxNumber(int num){
        if(num>10){
            int largest = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;
            int temp = 0;
            while (num > 0) {
                temp = num % 10;
                if(largest<temp){
                    largest = temp;
                }
                if(minimum>temp){
                    minimum = temp;
                }
                num = num/10;
            }
            System.out.println("Largest is: "+ largest+ " and smallest is: "+ minimum);
        }else {
            System.out.println("Number has to be of two digits");
        }
    }
    public static void main(String[] args){
        int num = 198345;
        findMinMaxNumber(num);
    }
}
