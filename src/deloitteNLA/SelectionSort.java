package deloitteNLA;

public class SelectionSort {
    static void selectionSorting(int[] arr){
        int min = 0, temp = 0;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=1+i;j<arr.length;j++){
                if(arr[i] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 23, 56};
        selectionSorting(arr);
    }
}
