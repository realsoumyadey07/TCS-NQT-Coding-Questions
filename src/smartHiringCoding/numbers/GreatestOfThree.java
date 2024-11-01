package smartHiringCoding.numbers;

public class GreatestOfThree {
    public static void findGreatestOne(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("a is greatest");
        } else if (b>a && b>c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 5;
        findGreatestOne(a, b, c);
    }
}
