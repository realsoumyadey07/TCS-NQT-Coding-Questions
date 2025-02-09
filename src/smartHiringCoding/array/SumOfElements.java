package smartHiringCoding.array;

public class SumOfElements {
    static int calculateSumOfElements(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = calculateSumOfElements(arr);
        System.out.println("The sum of the elements is: "+ sum);
    }
}
