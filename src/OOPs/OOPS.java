package OOPs;
import OOPs.packedges.*;

class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("Writing something...");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ball";
        pen1.write();
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";
        pen1.printColor();
        pen2.printColor();
        // example of packages in java
        Account acc1 = new Account("Soumya Dey");
        acc1.getName();
        System.out.println(acc1.name);
    }
}
