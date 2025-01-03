package strings;


import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        //String declaration
        String name = "Soumya";
        String fullName = "Soumyadip Dey";
        String sentance = "My name is Soumya Dey";
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
//        String name1 = sc.nextLine();
//        System.out.println("Your name is: "+ name1);

        //concatination
        String firstName = "Soumya";
        String lastName = "Dey";
        System.out.println(firstName + lastName);
        System.out.println(firstName.length());

        //java string methods
        //charAt()
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+", ");
        }
        //compareTo()
        String name2 = "Mala";
        String name3 = "Mala";
        if(name3.compareTo(name2)==0){
            System.out.println("eqal");
        } else {
            System.out.println("not eqal");
        }
        //subString()
        String sentence2 = "My name is soumya";
        String name4 = sentence2.substring(11, sentence2.length());
        System.out.println(name4);
        //
    }
}
