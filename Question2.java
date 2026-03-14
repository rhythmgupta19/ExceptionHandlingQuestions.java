// Write a Java program that demonstrates nested try-catch blocks where an inner block handles 
// ArithmeticException and the outer block handles ArrayIndexOutOfBoundsException.

public class Question2 {
    public static void main(String[] args) {
        try{
             int arr[] = {24,56,76,87};
             try{
                int div = 56/0;
             }
             catch(ArithmeticException e){
                System.out.println("Division by zero error.");
             }
             System.out.println(arr[9]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Enter the correct value of index");
        }
       
    }
}
