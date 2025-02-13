package smartHiringCoddingRevision.sortingAlgos;

public class InsertionSort {
    static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i;
            int temp = arr[i];
            while (j > 0 && temp < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 9, 1, 5, 3, 7};
        int[] sortedArr = insertionSort(arr);
        for(int i: sortedArr){
            System.out.print(i+ ", ");
        }
    }
}
