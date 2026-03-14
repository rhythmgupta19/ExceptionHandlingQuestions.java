// Write a Java program that accepts two integers from the user and handles 
// both ArithmeticException and InputMismatchException using multiple catch blocks.

import java.util.InputMismatchException;
import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero error.");
        }
        catch(InputMismatchException e){
            System.out.println("Enter the value in integer only.");
        }
        
        

    }
}