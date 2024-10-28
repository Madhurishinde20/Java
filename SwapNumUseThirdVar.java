class SwapNumUseThirdVar
{
 public sttaic void main(String x[])
 {
     // Initialize variables
        int a = 6;
        int b = 8;

        // Print initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap values using a third variable
        int temp = a; // Store value of 'a' in 'temp'
        a = b;        // Assign value of 'b' to 'a'
        b = temp;     // Assign value of 'temp' (originally 'a') to 'b'

        // Print swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/* Output-
Before swapping:
a = 6
b = 8
After swapping:
a = 8
b = 6
*/

