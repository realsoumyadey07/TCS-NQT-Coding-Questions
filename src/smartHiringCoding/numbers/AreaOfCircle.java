package smartHiringCoding.numbers;

public class AreaOfCircle {
    public static void calculateArea(int num){
        double area = 3.14 * num * num;
        System.out.println("Area of the circle is: "+ area);
    }
    public static void main(String[] args){
        int num = 5;
        calculateArea(num);
    }
}
