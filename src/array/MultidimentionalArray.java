package array;

public class MultidimentionalArray {
    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ ", ");
            }
            System.out.println();
        }
        System.out.println("After foreach");
        for(int[] i: arr){
            for(int j: i){
                System.out.print(j+ ", ");
            }
            System.out.println();
        }
    }
}
