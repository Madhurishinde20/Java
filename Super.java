class Parent { 
    private String name;

    // Constructor of Parent class
    Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor called. Name: " + this.name);
    }

    // A method in Parent class
    public void displayParentInfo() {
        System.out.println("Parent Name: " + name);	
    }
}

// Child class
class Child extends Parent {
    private int grade;

    // Constructor of Child class that invokes parent constructor using super
    Child(String name, int grade) {
        super(name);  // Calling the parent class (Parent) constructor
        this.grade = grade;
        System.out.println("Child constructor called. Grade: " + this.grade);
    }

    // A method in Child class
    public void displayChildInfo() {
        // Call method from parent class
        super.displayParentInfo();
        System.out.println("Child Grade: " + this.grade);
    }
}

public class Super {
    public static void main(String[] args) {
        // Creating an object of the Child class
        Child c = new Child("Ram", 5);
   
        // Displaying information
        c.displayChildInfo();
    }
}
/* OUTPUT:
Parent constructor called. Name: Ram
Child constructor called. Grade: 5
Parent Name: Ram
Child Grade: 5
*/