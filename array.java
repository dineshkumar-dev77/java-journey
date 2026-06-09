# write a simple Java program to create and initialize an array
public class ArrayExample {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = new int[5];
        
        // Initialize the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}