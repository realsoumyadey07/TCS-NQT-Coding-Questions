package smartHiringCoding.array;

public class RotateArrayByK {
    static void rotateArrayByK(int[] arr, int k, String direction){
        if(k>=arr.length){
            return;
        }
        if(direction == "left"){
            int[] temp = new int[k];
            for(int i=0;i<arr.length;i++){
                if(i<k){
                    temp[i] = arr[i];
                } else {
                  arr[i-k] = arr[i];
                }
            }
            int j = 0;
            for(int i=arr.length-k;i<arr.length;i++){
                arr[i] = temp[j];
                j++;
            }
            for(int i: arr){
                System.out.print(i+ ", ");
            }
        } else {
            int[] temp = new int[k];
            int m = 0;
            for (int i=arr.length-1;i>=0;i--){
                if(i>arr.length-k-1){
                    temp[m] = arr[arr.length-k+m];
                    m++;
                } else {
                    arr[i+k] = arr[i];
                }
            }
            for(int i=0; i<k;i++){
                arr[i] = temp[i];
            }
            for(int i: arr){
                System.out.print(i+ ", ");
            }
        }
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8};
        int k = 2;
        String direction = "right";
        rotateArrayByK(arr, k, direction);
    }
}
