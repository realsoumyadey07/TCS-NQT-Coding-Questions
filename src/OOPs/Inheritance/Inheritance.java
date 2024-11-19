package OOPs.Inheritance;

class Shap {
    String color;
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shap {
    public void area(int length, int height){
        System.out.println("Area is: "+ length*height);
    }
}

//this is multilevel inheritance
class EquilateralTriangle extends Triangle {
    public void area(int length, int height){
        System.out.println("Area is: "+ length*height);
    }
}

public class Inheritance {
    public static void main(String[] args){
        Triangle tri1 = new Triangle();
        tri1.color = "Black";
        System.out.println("Color is: "+ tri1.color);
        tri1.area();
    }
}
