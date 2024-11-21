/*Write Java Exception Handling program  using  multiple catch block*/
public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            // Attempting to divide by zero, which will cause ArithmeticException
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("Result: " + result);

            // Attempting to access an invalid index in the array, which will cause ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);

            // Attempting to parse an invalid integer from a string, which will cause NumberFormatException
            String str = "ABC";
            int number = Integer.parseInt(str);

        } catch (ArithmeticException e) {
            // Handle ArithmeticException (e.g., division by zero)
            System.out.println("Error: Division by zero! " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException (e.g., invalid index access)
            System.out.println("Error: Invalid array index! " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle NumberFormatException (e.g., invalid format when converting string to number)
            System.out.println("Error: Invalid number format! " + e.getMessage());
        } catch (Exception e) {
            // A generic catch block to catch any other unforeseen exceptions
            System.out.println("Error: An unexpected error occurred. " + e.getMessage());
        }

        // Program continues after exception handling
        System.out.println("Program execution continues after the exception handling.");
    }
}

/* output-
   Error: Division by zero! / by zero
   Program execution continues after the exception handling.

*/