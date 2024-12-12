import java.util.HashSet;
import java.util.Scanner;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding initial elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Initial HashSet: " + set);

        // Get the element to append from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an element to append: ");
        String element = scanner.nextLine();

        // Append the element to the HashSet
        if (set.add(element)) {
            System.out.println("Element '" + element + "' added successfully.");
        } else {
            System.out.println("Element '" + element + "' already exists in the HashSet.");
        }

        // Display the updated HashSet
        System.out.println("Updated HashSet: " + set);

    }
}
/*
Initial HashSet: [Banana, Cherry, Apple]
Enter an element to append: Mango
Element 'Mango' added successfully.
Updated HashSet: [Banana, Cherry, Apple, Mango]

*/
