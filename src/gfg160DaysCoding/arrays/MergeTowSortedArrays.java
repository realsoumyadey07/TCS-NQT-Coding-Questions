package gfg160DaysCoding.arrays;

public class MergeTowSortedArrays {
    static int[] mergeTwoSortedArray(int[] a, int[] b){
        int[] newArray = new int[a.length+ b.length];
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]){
                newArray[k] = a[i];
                i++;
                k++;
            } else {
                newArray[k] = b[j];
                j++;
                k++;
            }
        }
        while (i<a.length){
            newArray[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length){
            newArray[k] = b[j];
            j++;
            k++;
        }
        return newArray;
    }
    public static void main(String[] args){
        int[] a = {0, 2, 6, 8, 9};
        int[] b = {1, 3, 5, 7};
        int[] newArr = mergeTwoSortedArray(a, b);
        for(int i: newArr){
            System.out.print(i+ ", ");
        }
    }
}
