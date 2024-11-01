package smartHiringCoding.numbers;

public class GreatestOfTwo {
    public static void findGreater(int a, int b){
        if(a==b){
            System.out.println("Numbers are equal!");
        } else if(a>b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        findGreater(a, b);
    }
}
