import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Declare a Stack
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        // Display the stack
        System.out.println("Stack after pushing 10 elements: " + stack);

        // Pop 4 elements from the stack
        stack.pop();
        System.out.println("Removed element: 10");
        stack.pop();
        System.out.println("Removed element: 9");
        stack.pop();
        System.out.println("Removed element: 8");
        stack.pop();
        System.out.println("Removed element: 7");

        // Display the stack after removal
        System.out.println("Stack after removing 4 elements: " + stack);
    }
}
/*
Stack after pushing 10 elements: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Removed element: 10
Removed element: 9
Removed element: 8
Removed element: 7
Stack after removing 4 elements: [1, 2, 3, 4, 5, 6]

*/