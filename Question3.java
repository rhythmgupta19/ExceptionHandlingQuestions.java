// Write a Java program to read numbers from the user and calculate their average.
//  Handle InputMismatchException if the user enters a non-numeric value.

import java.util.InputMismatchException;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the first number:");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number:");
            int num2 = sc.nextInt();

            int avg = (num1+num2)/2;
        }
        catch(InputMismatchException e){
            System.out.println("Enter value in Integer only.");
        }
    }
}
