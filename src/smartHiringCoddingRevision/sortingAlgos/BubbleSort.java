package smartHiringCoddingRevision.sortingAlgos;

public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swaped = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swaped = true;
                }
            }
            if(!swaped) {
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 3, 9, 2};
        int[] sortedArr = bubbleSort(arr);
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
}
