package OOPs.polymorphism;

class Student {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Name is: "+ name);
    }
    public void printInfo(int age){
        System.out.println("Age is: "+ age);
    }
    public void printInfo(String name, int age){
        System.out.println("Name is: "+name+ " and age is: "+ age);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student std1 = new Student("Soumya Dey", 22);
        std1.printInfo("Soumya");
        std1.printInfo(22);
        std1.printInfo("Soumya Dey", 22);
    }
}
