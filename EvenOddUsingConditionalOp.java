// Import the Scanner class to read user input
import java.util.Scanner;

// Define the EvenOdd class
public class EvenOddUsingConditionalOp
 {
    // Main method where program execution begins
    public static void main(String[] args)
	{
        // Create a Scanner object to read from System.in
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Use nextInt() to read the integer input
        int num = sc.nextInt();

        // Use the conditional operator to check if the number is even
        // (remainder 0 when divided by 2)
        String result = (num % 2 == 0) ? "Even" : "Odd";

        // Print the result
        System.out.println(num + " is " + result);

    }
}

