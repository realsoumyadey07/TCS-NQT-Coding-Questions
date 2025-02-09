package smartHiringCoding.array;

public class AverageOfAllElements {
    static int calculateAverageOfAllElements(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum+=i;
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int average = calculateAverageOfAllElements(arr);
        System.out.println(average);
    }
}
