package fileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class JavaFiles {
    public static void writeToFile(File myFile){
        try(FileWriter writer = new FileWriter(myFile)){
            writer.write("Hi my name is Soumya Dey and I belong from Kolkata!");
        } catch (IOException e){
            System.out.println("An error ocurred!");
            e.printStackTrace();
        }
    }
    public static void readFile(File myFile){
        try{
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("An error ocurred!");
            e.printStackTrace();
        }
    }
    public static boolean deleteFile(String path){
        File newFile = new File(path);
        if(newFile.exists()){
            return newFile.delete();
        } else {
            System.out.println("File not found!");
            return false;
        }
    }

    public static void main(String[] args){
        try {
            File myFile = new File("D:\\vs code documents\\TCS-NQT-Coding-Questions\\src\\fileHandling\\soumya.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: "+ myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            writeToFile(myFile);
            readFile(myFile);
            if(deleteFile("soumya.txt")){
                System.out.println("File deleted!");
            }else {
                System.out.println("File could not be deleted!")    ;
            }
        } catch (IOException e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}
