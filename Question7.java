// Write a Java program that demonstrates the use of throws
//  keyword in a method that reads data from a file

import java.io.*;
public class Question7 {
    static void ReadFile()throws IOException{
        try{
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
        }
        throw new FileNotFoundException("file not found")
    }
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
    }
}
