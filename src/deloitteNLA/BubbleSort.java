package deloitteNLA;

public class BubbleSort {
    static void bubbleSorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j=i;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 5, 9, 3, 4};
        bubbleSorting(arr);
    }
}
