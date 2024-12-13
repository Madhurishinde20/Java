/*Write a program to add elements to the HashMap given the key as integer and value data type is String*/
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with Integer as key and String as value
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5, "berry");

        // Printing the HashMap
        System.out.println("HashMap content:");
        for (Integer key : map.keySet())
		{
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
/*OUTPUT:
  HashMap content:
Key: 1, Value: Apple
Key: 2, Value: Banana
Key: 3, Value: Cherry
Key: 4, Value: Date
Key: 5, Value: berry

*/
