package collectionFrameworks.listInterface;
import java.util.Vector;

class Student {
    String name;
    int rollno;
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}

public class VectorsInJava {
    public static void printVerctors(Vector<Student> vector){
        for(Student i: vector){
            System.out.println("My name is: "+ i.name+ "and my roll no. is: "+ i.rollno);
        }
    }
    public static void main(String[] args){
        Vector<Student> vector = new Vector<>();
        Student s1 = new Student("Soumya Dey", 119);
        Student s2 = new Student("Ayush Singh", 207);
        vector.add(s1);
        vector.add(s2);
        printVerctors(vector);
    }
}
