package OOPs;

//poly: multiple and morphism: forms
//ploymorphism simply means multiple forms of doing same thing

class Employee {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Name is: "+ name);
    }
    public void printInfo(int age){
        System.out.println("Age is: "+ age);
    }
    public void printInfo(String name, int age){
        System.out.println("Name is: "+ name+ ", Age is: "+ age);
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Employee em1 = new Employee();
        em1.age = 22;
        em1.name = "Soumya Dey";
        em1.printInfo(em1.name, em1.age);
    }
}
