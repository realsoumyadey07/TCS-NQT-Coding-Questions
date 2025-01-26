package deloitteNLA;

public class QuickSort {
    public int reverseTheArray(int[] arr, int low, int high){
        int pivot = arr[(low+ high)/2];
        while (low<=high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high++;
            }
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return low;
    }
    public void quickSortRecursion(int[] arr, int low, int high){
        int pi = reverseTheArray(arr, low, high);
        if( low < pi-1) {
            reverseTheArray(arr, low, pi-1);
        }
        if( high > pi) {
            reverseTheArray(arr, pi, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 65, 23, 98, 45};
        QuickSort quksrt = new QuickSort();
        quksrt.quickSortRecursion(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
}
