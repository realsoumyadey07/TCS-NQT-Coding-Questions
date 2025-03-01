package OOPs.constructor;

class Student {
    String name;
    int age;
    public void printName(){
        System.out.println("Name is: "+ this.name);
    }
    //non parameterized constructor
    Student(){
        System.out.println("Student object is created!");
    }
    //parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //copy constructor
    Student(Student std){
        this.name = std.name;
        this.age = std.age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Soumya Dey";
        std1.age = 22;
        std1.printName();
        Student std2 = new Student("Ishan Dey", 4);
        std2.printName();
        Student std3 = new Student(std2);
        std3.printName();
    }
}
