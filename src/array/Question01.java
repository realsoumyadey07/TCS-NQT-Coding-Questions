package array;

import java.util.Scanner;

public class Question01 {
    static int findTheIndex(int[] arr, int x){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int x = 4;
        int[] arr = new int[5];
        int index = findTheIndex(arr, 4);
        if(index>0){
            System.out.println("Index got found at: "+ index+ "th position.");
        } else {
            System.out.println("Index didn't get found");
        }
    }
}
