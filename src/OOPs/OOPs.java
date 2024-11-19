package OOPs;

class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println("The color of the pen is: "+ this.color);
    }
}

class Student {
    String name;
    int age;
    public void printName(){
        System.out.println("Name is: "+ this.name);
    }
    public void printAge(){
        System.out.println("Age is: "+ this.age);
    }
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
    Student(){
        System.out.println("Student constructor created!");
    }
}

public class OOPs {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        pen1.printColor();
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ballpoint";
        pen2.printColor();
        pen2.write();
        Student student1 = new Student();
        student1.age = 22;
        student1.name = "Soumyadip Dey";
        student1.printAge();
        student1.printName();
        Student student2 = new Student(student1);
        student2.age = 21;
        student2.printAge();
        student2.printName();
    }
}
