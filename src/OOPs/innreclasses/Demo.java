package OOPs.innreclasses;

class A {
    int age;
    public void show(){
        System.out.println("Showing something...");
    }
    static class B {
        public void config(){
            System.out.println("In config...");
        }
    }
    class C {
        public void config(){
            System.out.println("In config...");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.age = 22;
        obj.show();
        //for inner static class
        A.B obj1 = new A.B();
        obj1.config();
        //for inner non-static class
        A.C obje2 = obj.new C();
        obje2.config();
    }
}
