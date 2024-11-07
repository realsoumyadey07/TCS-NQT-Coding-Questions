package fileHandling;
import java.io.File;
import java.io.IOException;

public class JavaFiles {
    public static void main(String[] args){
        try {
            File myFile = new File("soumya.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: "+ myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
