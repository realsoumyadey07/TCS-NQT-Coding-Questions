package sortingAlgo;

public class BubbleSorting {
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int flag = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
    static void bubbleSortForString(String[] names){
        for(int i=0;i<names.length-1;i++){
            int flag = 0;
            for(int j=0;j<names.length-1-i;j++){
                if(names[j].compareTo(names[j+1])>0){
                    String temp = "";
                    temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(String i: names){
            System.out.println(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {9, 3, 1, 5, 8, 3, 7, 4};
//        bubbleSort(arr);
        String[] names = {"soumya", "syan", "xiuye", "shadi", "zikey", "ayush"};
        bubbleSortForString(names);
    }
}
