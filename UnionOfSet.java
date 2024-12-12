import java.util.HashSet;

public class UnionOfSet{
    public static void main(String[] args) {
        // Create two HashSets
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // Adding elements to the first HashSet
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        // Adding elements to the second HashSet
        set2.add("Banana");
        set2.add("Dragonfruit");
        set2.add("Elderberry");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Perform union of both sets
        HashSet<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Display the result of the union
        System.out.println("Union of Set 1 and Set 2: " + unionSet);
    }
}
/*
 Set 1: [Banana, Cherry, Apple]
Set 2: [Elderberry, Dragonfruit, Banana]
Union of Set 1 and Set 2: [Banana, Cherry, Apple, Elderberry, Dragonfruit]

*/
