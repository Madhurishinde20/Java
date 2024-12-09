public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Accessing array elements:");
        
        try {
            // Loop through the array and intentionally access an out-of-bounds index
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and print a meaningful message
            System.out.println("Exception caught: Trying to access an index beyond the array size!");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
/*
 Accessing array elements:
Element at index 0: 1
Element at index 1: 2
Element at index 2: 3
Element at index 3: 4
Element at index 4: 5
Exception caught: Trying to access an index beyond the array size!
Exception message: Index 5 out of bounds for length 5
Program continues after handling the exception.
*/