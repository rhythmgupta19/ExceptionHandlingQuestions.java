// Create a custom exception class called InvalidSalaryException and 
// write a program that throws this exception if the salary entered is less than 10,000.

import java.util.*;

class InvalidSallaryException extends Exception{
    public InvalidSallaryException(String msg){
        super(msg);
    }
}
public class Question8 {
    public static void main(String[] args) throws InvalidSallaryException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();

        if(salary < 10000){
                throw new InvalidSallaryException("Sallary must be more than 10000");
        }
        System.out.println(salary);
        System.out.println("Valid salary");
    }
}
