// Write a Java program that throws an exception using 
// the throw keyword when a number entered by the user is less than zero

import java.io.*;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num < 0){
            throw new ArithmeticException("Negative number not allowed...");
        }
        System.out.println(num);
        System.out.println("Number is valid");
    }
}
