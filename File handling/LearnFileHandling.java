import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.annotation.processing.FilerException;



public class LearnFileHandling {
    public static void main(String[] args) {

        // // Code to create a file
        // File myFile = new File("Text.txt");
        // try {
        //     myFile.createNewFile();
        // } catch (IOException e) {
        //     System.out.println("unable to create file");
        //     e.printStackTrace();
        // }


        // // Code to write to a file
        // try{
        //     FileWriter fileWriter = new FileWriter("text.txt");
        //     fileWriter.write("this is my first file creating by using\njava file handling");
        //     fileWriter.close();
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }

        // // Code to reading a file
        // try {
        //     FileReader myFileReader = new FileReader("text.txt");
        //     Scanner sc = new Scanner(myFileReader);
        //     while(sc.hasNextLine()){
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        // } 
        // catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        // Code to delete a file

        File f = new File("text.txt");
        try{
            f.delete();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
