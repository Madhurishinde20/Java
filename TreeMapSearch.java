import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {
        // Create a TreeMap to store name-age pairs
        TreeMap<String, Integer> nameAgeMap = new TreeMap<>();

        // Add some name-age pairs to the TreeMap
        nameAgeMap.put("John", 25);
        nameAgeMap.put("Madhuri", 30);
        nameAgeMap.put("Sakshi", 22);
        nameAgeMap.put("Nikita", 28);
        nameAgeMap.put("Arjun", 35);

        // Display the entries in the TreeMap
        System.out.println("Name-Age pairs in the TreeMap: " + nameAgeMap);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name to search for
        System.out.print("Enter a name to search: ");
        String name = scanner.nextLine();

        // Search for the name in the TreeMap
        if (nameAgeMap.containsKey(name)) {
            // If the name exists, display the corresponding age
            System.out.println(name + " is " + nameAgeMap.get(name) + " years old.");
        } else {
            // If the name does not exist, display a not found message
            System.out.println("The name \"" + name + "\" was not found in the TreeMap.");
        }

    }
}

/*OUTPUT-
Name-Age pairs in the TreeMap: {Arjun=35, John=25, Madhuri=30, Nikita=28, Sakshi=22}
Enter a name to search: Madhuri
Madhuri is 30 years old.
*/