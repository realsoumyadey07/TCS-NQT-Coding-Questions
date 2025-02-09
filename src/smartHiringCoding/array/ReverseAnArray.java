package smartHiringCoding.array;


public class ReverseAnArray {
    static int[] reversedArr(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[arr.length-(i+1)];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] reversedArr = reversedArr(arr);
        for(int i: reversedArr){
            System.out.print(i+ ", ");
        }
    }
}
