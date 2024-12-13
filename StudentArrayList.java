/*.Create a Student class and create an array list to add 10 student objects and print them using a for each loop.*/

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private String rollNumber;

    // Constructor
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}

public class StudentArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Adding 10 student objects to the ArrayList
        students.add(new Student("John", 20, "S001"));
        students.add(new Student("Mary", 22, "S002"));
        students.add(new Student("Alice", 21, "S003"));
        students.add(new Student("Bob", 23, "S004"));
        students.add(new Student("Charlie", 22, "S005"));
        students.add(new Student("David", 20, "S006"));
        students.add(new Student("Eva", 21, "S007"));
        students.add(new Student("Frank", 23, "S008"));
        students.add(new Student("Grace", 22, "S009"));
        students.add(new Student("Hannah", 21, "S010"));

        // Using a regular for loop to print all student details
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Roll Number: " + student.getRollNumber());
        }
    }
}

/*OUPUT:
  Name: John, Age: 20, Roll Number: S001
Name: Mary, Age: 22, Roll Number: S002
Name: Alice, Age: 21, Roll Number: S003
Name: Bob, Age: 23, Roll Number: S004
Name: Charlie, Age: 22, Roll Number: S005
Name: David, Age: 20, Roll Number: S006
Name: Eva, Age: 21, Roll Number: S007
Name: Frank, Age: 23, Roll Number: S008
Name: Grace, Age: 22, Roll Number: S009
Name: Hannah, Age: 21, Roll Number: S010

*/
