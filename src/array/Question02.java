package array;

import java.util.Scanner;

public class Question02 {
    static int[] findTheElement(int[][] arr, int n, int col){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j] == n){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        int n = 4;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int[] index = findTheElement(arr, n, column);
        for(int i: index){
            System.out.print(i+", ");
        }
    }
}
