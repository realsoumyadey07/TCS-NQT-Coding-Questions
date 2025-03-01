package OOPs.inheritance;

//hybrid inheritance

class Fruit {
    String color;
}

class WinterFruits extends Fruit {
    void setColor(String color){
        this.color = color;
    }
    void getColor(){
        System.out.println("The color is: "+ this.color);
    }
}

class SummerFruits extends Fruit {
    void setColor(String color){
        this.color = color;
    }
    void getColor(){
        System.out.println("The color is: "+ this.color);
    }
}

class Apple extends WinterFruits {
    String tast;
    void getTast(){
        System.out.println("The tast is: "+ this.tast);
    }
    Apple(String tast){
        this.tast = tast;
    }
}

public class HYBI {
    public static void main(String[] args) {
        Apple app = new Apple("Good");
        app.setColor("Red");
        app.getTast();
        app.getColor();
    }
}
