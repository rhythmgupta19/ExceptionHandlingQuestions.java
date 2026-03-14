
// Write a Java program that checks whether a string entered by the user is a valid integer.
//  Handle NumberFormatException if the string is not numeric.

import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the value ");
            String num = sc.nextLine();
            System.out.println(num);

        }
        catch(NumberFormatException e){
            System.out.println("String is not numeric");
        }
    }
}
