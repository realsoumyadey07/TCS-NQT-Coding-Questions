package sortingAlgo;

public class InsertionSort {
    public static void insertionSorting(int[] num){
        for(int i=1;i<num.length;i++){
            int j = i;
            int temp = num[i];
            while (j>0 && num[j-1] > temp){
                num[j] = num[j-1];
                j--;
            }
            num[j] = temp;
        }
        for(int i: num){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] num = {13,46,24,52,20,9};
        insertionSorting(num);
    }
}
