package smartHiringCoddingRevision.sortingAlgos;

public class SelectionSort {
    static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 1, 5, 9};
        int[] sortedArr = selectionSort(arr);
        for(int i: sortedArr){
            System.out.print(i+", ");
        }
    }
}
