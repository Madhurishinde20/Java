import java.util.Scanner;

public class SimpleSquareCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the side length of the square
        System.out.print("Enter the length of a side of the square: ");
        double sideLength = scanner.nextDouble();
        
        // Calculate area and perimeter
        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;
        
        // Display the results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
       
    }
}
/* Enter the length of a side of the square: 5
Area: 25.0
Perimeter: 20.0 */
