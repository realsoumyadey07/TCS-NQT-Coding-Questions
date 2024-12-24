package OOPs.constructors;

public class Employee {
    String name;
    int emp_id;
    int salary;
    boolean isThere;
    char n;
    float d;
    //parameterized constructor
    Employee(String name, int emp_id){
        this.name = name;
        this.emp_id = emp_id;
    }
    //no argument constructor
    Employee(){
        System.out.println("No argument constructor");
    }
    public static void main(String[] args){
        Employee em1 = new Employee();
//        System.out.println(em1.salary);
        Employee em2 = new Employee("Soumya Dey", 119);
        System.out.println(em1.name);
        System.out.println(em1.isThere);
        System.out.println(em1.n);
        System.out.println(em1.d);
        System.out.println(em2.name);
    }
}
