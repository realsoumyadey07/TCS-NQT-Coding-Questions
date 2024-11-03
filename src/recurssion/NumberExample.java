package recurssion;

public class NumberExample {
    public static void main(String[] args) {
        // write a function that takes in a number and print it
        // print first 5 numbers: 1, 2, 3, 4, 5.
        printNum(1);
    }
    static void printNum(int n){
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n+1);

    }
}
