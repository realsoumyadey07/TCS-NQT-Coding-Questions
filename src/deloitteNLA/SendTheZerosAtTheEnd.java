package deloitteNLA;

public class SendTheZerosAtTheEnd {
    static void sendTheZerosAtTheEnd(int[] arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 6, 0, 3, 5, 0, 2};
        sendTheZerosAtTheEnd(arr);
    }
}
