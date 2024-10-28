public class SwapVar {

	public static void main(String[] args) {
		
		        // Initial values
		        int x = 5;
		        int y = 10;

		        // Display original values
		        System.out.println("Before swapping:");
		        System.out.println("x = " + x);
		        System.out.println("y = " + y);

		        // Swapping without a third variable
		        x = x + y;  // Step 1: x now contains the sum of x and y
		        y = x - y;  // Step 2: y is now the original value of x
		        x = x - y;  // Step 3: x is now the original value of y

		        // Display swapped values
		        System.out.println("After swapping:");
		        System.out.println("x = " + x);
		        System.out.println("y = " + y);
		    }
		}

/* Output-
	 Before swapping:
     x = 5
     y = 10
    After swapping:
     x = 10
     y = 5  */

