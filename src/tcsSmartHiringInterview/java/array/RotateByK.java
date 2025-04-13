package tcsSmartHiringInterview.java.array;

public class RotateByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] temp = new int[k];
        for(int i=0;i<arr.length;i++){
            if(i<k){
                temp[i] = arr[i];
            }else {
                arr[i-k] = arr[i];
            }
        }
        int i = 0;
        for(int j=arr.length-k;j<arr.length;j++){
            arr[j] = temp[i];
            i++;
        }
        for(int l: arr){
            System.out.print(l+ ", ");
        }
    }
}
