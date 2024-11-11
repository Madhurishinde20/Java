/* Create an interface called "Person" with a method called "speak". 
   Create two classes  called "Student" and "Teacher" that implement  the Person interface and implement the "speak" method.
   Create objects of both the Student and  Teacher classes and call their respective "speak"  methods.
*/
interface Person {
    void speak();
}

// Implement the Student class
class Student implements Person {
    public void speak() {
        System.out.println("I am a student. I am here to learn.");
    }
}

// Implement the Teacher class
class Teacher implements Person {
    public void speak() {
        System.out.println("I am a teacher. I am here to teach.");
    }
}

// Main class to test the functionality
public class PersonInterface {
    public static void main(String[] args) {
        // Create a Student object and call the speak method
        Person student = new Student();
        student.speak();

        // Create a Teacher object and call the speak method
        Person teacher = new Teacher();
        teacher.speak();
    }
}
/* OUTPUT:
   I am a student. I am here to learn.
   I am a teacher. I am here to teach.
*/