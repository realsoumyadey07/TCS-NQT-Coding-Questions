package OOPs.inheritance;

//hierarchical inheritance

class Vehicle {
    String color;
}

class Car extends Vehicle {
    void setColor(String color){
        this.color = color;
    }
    void getColor(){
        System.out.println("The color is: "+ this.color);
    }
}

class Bike extends Vehicle {
    void setColor(String color){
        this.color = color;
    }
    void getColor(){
        System.out.println("The color is: "+ this.color);
    }
}

public class HI {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Black");
        car1.getColor();
        Car car2 = new Car();
        car2.setColor("Blue");
        car2.getColor();
        Bike bike1 = new Bike();
        bike1.setColor("White");
        bike1.getColor();
    }
}
