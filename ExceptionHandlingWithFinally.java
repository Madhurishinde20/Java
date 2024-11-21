/*Write Java Exception Handling program  using finally block*/

public class ExceptionHandlingWithFinally {

    public static void main(String[] args) {
        try {
            // Try block to test division
            int num1 = 10;
            int num2 = 0; // This will cause ArithmeticException
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block to handle the ArithmeticException (division by zero)
            System.out.println("Error: " + e.getMessage());
        } finally {
            // The finally block will always execute, whether or not an exception occurs
            System.out.println("Finally block executed. This runs after try/catch.");
        }

        System.out.println("Program execution continues after the finally block.");
    }
}

/* output-
  Error: / by zero
Finally block executed. This runs after try/catch.
Program execution continues after the finally block.

*/