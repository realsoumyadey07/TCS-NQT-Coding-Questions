package OOPs.innreclasses;

class D {
    public void show(){
        System.out.println("from D");
    }
}

abstract class E {
    public abstract void show();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        D obj = new D(){
            public void show(){
                System.out.println("from new show method");
            }
        };
        obj.show();
        //implementing anonymous abstructed object together
        E obj1 = new E(){
            public void show(){
                System.out.println("show from anonymous abstructed class");
            }
        };
        obj1.show();
    }
}
