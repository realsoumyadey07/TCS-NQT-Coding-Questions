package sortingAlgo;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {56, 21, 54, 89, 32, 13, 67};
        String[] arr2 = {"Soumya Dey", "Mala Dey", "Sajal Dey"};
        //for numbers only
        int min, temp=0;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i: arr){
            System.out.print(i+", ");
        }
        //for string value only
        int min2;
        String temp2 = "";
        for(int i=0;i<arr2.length;i++){
            min2 = i;
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[j].compareTo(arr2[min2])<0){
                    min = j;
                }
            }
            temp2 = arr2[i];
            arr2[i] = arr2[min2];
            arr2[min2] = temp2;
        }
        for(String i: arr2){
            System.out.print(i+", ");
        }
    }
}
