// Write a Java program that accesses elements in a 2D array and handles
//  ArrayIndexOutOfBoundsException if the index is invalid.

public class Question11 {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4}};

        try{
            System.out.println(arr[2][3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter a valid index.");
        }
    }
}
