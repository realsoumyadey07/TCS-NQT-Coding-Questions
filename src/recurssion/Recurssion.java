package recurssion;

public class Recurssion {
    public static void message1(){
        System.out.println("Hello world!");
        message2();
    }

    public static void message2() {
        System.out.println("Hello world!");
        message3();
    }
    public static void message3() {
        System.out.println("Hello world!");
        message4();
    }
    public static void message4() {
        System.out.println("Hello world!");
        message5();
    }
    public static void message5() {
        System.out.println("Hello world!");
    }
    public static void main(String[] args) {
        message1();
    }
}
