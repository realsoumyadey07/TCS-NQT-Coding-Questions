package gfg160DaysCoding.arrays;

public class InversionCount {
    static void countInversion(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            int f =i;
            int s = i+1;
            while(s<arr.length){
                if(arr[f]>arr[s]){
                    count++;
                    s++;
                } else {
                    s++;
                }
            }
        }
        System.out.println("Inversion is: "+ count);
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 1, 3, 5};
        countInversion(arr);
    }
}
