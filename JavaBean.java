import java.io.Serializable;

class Employee implements Serializable {
    private int EmpId;
    private String EmpName;
    private int EmpAge;
    private int EmpSalary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int empId, String empName, int empAge, int empSalary) {
        this.EmpId = empId;
        this.EmpName = empName;
        this.EmpAge = empAge;
        this.EmpSalary = empSalary;
    }

    // Getter and Setter for EmpId
    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        this.EmpId = empId;
    }

    // Getter and Setter for EmpName
    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        this.EmpName = empName;
    }

    // Getter and Setter for EmpAge
    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int empAge) {
        this.EmpAge = empAge;
    }

    // Getter and Setter for EmpSalary
    public int getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.EmpSalary = empSalary;
    }
}

public class JavaBean {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        
		emp.setEmpId(12);
		System.out.println(emp.getEmpId());
		
        emp.setEmpName("abc");
		System.out.println(emp.getEmpName());
		
		emp.setEmpAge(22);
		System.out.println(emp.getEmpAge());
      
        emp.setEmpSalary(55000);
        System.out.println(emp.getEmpSalary());
		
		
    }
}
/* 
12
abc
22
55000 */