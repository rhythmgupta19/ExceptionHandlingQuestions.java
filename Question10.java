// Write a Java program that handles NullPointerException when 
// attempting to access methods of a null object.

public class Question10 {
    public static void main(String[] args) {
        // Example of handling NullPointerException
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
