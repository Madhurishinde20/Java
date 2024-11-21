public class LargestElementInArray 
{
    public static void main(String[] args) 
	{
        // Predefined array
        int[] array = {3, 7, 2, 9, 4};

        // Find the largest element
        int largest = array[0];
        for (int i = 1; i < array.length; i++)
		{
            if (array[i] > largest)
			{
                largest = array[i];
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
/* OUTPUT:
    The largest element in the array is: 9
	*/