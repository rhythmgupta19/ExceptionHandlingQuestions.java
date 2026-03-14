// Write a Java program to demonstrate multiple exceptions 
// in a single catch block (Java 7 feature).

public class Question12 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[2];
            arr[5] = 20;

            int result = 10/0;
        }
        catch(ArithmeticException| ArrayIndexOutOfBoundsException e){
        System.out.println("Exception handled: " + e);
        }
    }
}
