// Write a Java program that demonstrates the use of finally block by closing a file resource properly.

import java.io.*;
public class Question5 {
    public static void main(String[] args) {
        FileReader fr = null;

        try{
            fr = new FileReader("test.txt");
            System.out.println("File opened");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
                    System.out.println("File closed");
                }
            }
            catch(IOException e){
                System.out.println("Error in closing file");
            }
        }
    }
}
