package OOPs.interfaces;

interface A {
    int age = 22;
    String area = "Kolkata";
    void show(); //by default this is a public abstruct method
    void config();
}

class B implements A {
    public void show(){
        System.out.println("Showing something..");
    }
    public void config(){
        System.out.println("Configing something....");
    }
}

public class Demo {
    public static void main(String[] args) {
        B list = new B();
        list.show();
        list.config();
        System.out.println(list.age);
        System.out.println(list.area);
    }
}
