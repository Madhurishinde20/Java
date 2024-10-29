public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to display
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print numbers from 1 to i
            }
            System.out.println(); // Move to the next line
        }
    }
}

/*
1
12
123
1234
12345 */