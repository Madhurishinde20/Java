/*Write a Java program to remove all elements from a hash set.*/
import java.util.HashSet;

public class HashSetClear {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Print the HashSet before clearing
        System.out.println("HashSet before clearing: " + set);

        // Remove all elements from the HashSet using clear() method
        set.clear();

        // Print the HashSet after clearing
        System.out.println("HashSet after clearing: " + set);
    }
}
/*OUTPUT:
  HashSet before clearing: [Banana, Date, Apple, Cherry]
  HashSet after clearing: []

*/