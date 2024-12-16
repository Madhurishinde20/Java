import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
    public int compareTo(Employee e) {
        // Compare ages; return 0 if equal, positive if greater, negative if less
        return Integer.compare(this.age, e.getAge());
    }
}

public class   {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "Madhuri", 22));
        emp.add(new Employee(102, "Sakshi", 23));
        emp.add(new Employee(103, "Nikita", 21));

        // Sort using Collections.sort()
        Collections.sort(emp);

        // Print sorted ages
        for (Employee e : emp) {
            System.out.println(e.getAge());
        }
    }
}
/* OUTPUT-
21
22
23
 */
