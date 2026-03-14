// Write a Java program that reads a file and handles
//  both FileNotFoundException and IOException

import java.io.*;
public class Question4 {
      public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("Error to read the file");
        }
        
      }
}
