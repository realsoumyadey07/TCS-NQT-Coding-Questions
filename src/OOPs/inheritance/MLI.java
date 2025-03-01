package OOPs.inheritance;

//single level inheritance

class Shape {
    public void area(){
        System.out.println("Displays area!");
    }
}

class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(l*h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h){
        System.out.println(l*h/2);
    }
}

public class MLI {
    public static void main(String[] args) {
        Triangle trl = new Triangle();
        trl.area(3, 5);
        EquilateralTriangle eqt = new EquilateralTriangle();
        eqt.area(3, 5);
    }
}
