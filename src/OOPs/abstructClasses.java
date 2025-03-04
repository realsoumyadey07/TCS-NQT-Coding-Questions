package OOPs;

abstract class Car {
    public abstract void drive();
    public abstract void run();
    public String color;
    public void music(){
        System.out.println("Playing music!");
    }
}

class FordMushtang extends Car {
    public void drive(){
        System.out.println("Driving...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void setColor(String color){
        this.color = color;
    }
    public void getColor(){
        System.out.println(this.color);
    }
}

public class abstructClasses {
    public static void main(String[] args) {
        FordMushtang m1 = new FordMushtang();
        m1.setColor("Black");
        m1.getColor();
        m1.drive();
        m1.music();
    }
}
