package searchingAlgo;

public class LinearSearching {
    public static void main(String[] args){
        int[] arr = {4, 1, 5, 8, 3, 9};
        int n = 50;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Item found in "+ (Integer)(i+1)+ "th position");
                found = true;
            }
        }
        if(!found){
            System.out.println("Item not found");
        }
    }
}
