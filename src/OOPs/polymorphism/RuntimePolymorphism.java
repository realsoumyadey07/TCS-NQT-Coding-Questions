package OOPs.polymorphism;

class A {
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class B extends A {
    public void show(){  //function overriding
        super.config();
        System.out.println("in B show");
    }
    public void config(){
        System.out.println("in B config");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
