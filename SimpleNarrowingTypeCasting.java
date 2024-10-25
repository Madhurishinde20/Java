public class SimpleNarrowingTypeCasting {

    public static void main(String[] args) {
        // Narrowing from double to int
        double doubleValue = 5.99;
        int intValue = (int) doubleValue; // Cast double to int
        System.out.println("Original double: " + doubleValue);
        System.out.println("Narrowed int: " + intValue); // Outputs: 5

        // Narrowing from long to int
        long longValue = 1000L;
        int anotherIntValue = (int) longValue; // Cast long to int
        System.out.println("Original long: " + longValue);
        System.out.println("Narrowed int: " + anotherIntValue); // Outputs: 1000

        // Narrowing from int to byte
        int thirdIntValue = 300;
        byte byteValue = (byte) thirdIntValue; // Cast int to byte
        System.out.println("Original int: " + thirdIntValue);
        System.out.println("Narrowed byte: " + byteValue); // Outputs: 44 (due to overflow)
    }
}
/*Original double: 5.99
Narrowed int: 5
Original long: 1000
Narrowed int: 1000
Original int: 300
Narrowed byte: 44
*/