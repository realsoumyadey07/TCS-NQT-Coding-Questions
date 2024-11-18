package sortingAlgo;

public class MergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args){
           int[] arr = {6, 2, 5, 8, 1, 4, 9, 2, 3};
    }
    public void sort(int[] inputArr){
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int lowerIndex, int higherIndex){
        if(lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex+lowerIndex)/2;
            divideArray(lowerIndex, middle);
            divideArray(middle+1, higherIndex);
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }
    public void mergeArray(int lowerIndex, int middle, int higherIndex){

    }
}
