package OOPs.Inheritance;

class Vehical {
    public void function(){
        System.out.println("It runs");
    }
}

class Bike extends Vehical {
    public void function(){
        System.out.println("It runs");
    }
}

class Car extends Vehical {
    public void function(){
        System.out.println("It also runs");
    }
}

public class HiraricalInheritance {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.function();
    }
}
