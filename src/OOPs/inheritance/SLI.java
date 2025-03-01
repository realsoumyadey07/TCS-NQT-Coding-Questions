package OOPs.inheritance;

//single level inheritance

class Animal {
    int leg;
    String color;
}

class Dog extends Animal {
    void setLegAndColor(int leg, String color){
        this.leg = leg;
        this.color = color;
    }
    void getLegAndColor(){
        System.out.println("Color is: "+ this.color);
        System.out.println("Leg is: "+ this.leg);
    }
}

public class SLI {
    public static void main(String[] args) {
        Dog dg1 = new Dog();
        dg1.setLegAndColor(4, "White");
        dg1.getLegAndColor();
    }
}
