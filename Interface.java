/* Write a Java program to create an interface Shape with the getArea() method.
 Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
 Implement the getArea() method for each of the three classes.
 */
interface Shape {
    double getArea();
}

// Implement the Rectangle class
class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement the getArea method
    public double getArea() {
        return width * height;
    }
}

// Implement the Circle class
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the getArea method
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Implement the Triangle class
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement the getArea method
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class to test the functionality
public class Interface {
    public static void main(String[] args) {
        // Create a Rectangle object and display its area
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        // Create a Circle object and display its area
        Shape circle = new Circle(7);
        System.out.println("Circle Area: " + circle.getArea());

        // Create a Triangle object and display its area
        Shape triangle = new Triangle(4, 8);
        System.out.println("Triangle Area: " + triangle.getArea());
    }
}
/* OUTPUT:
Rectangle Area: 50.0
Circle Area: 153.93804002589985
Triangle Area: 16.0
*/
