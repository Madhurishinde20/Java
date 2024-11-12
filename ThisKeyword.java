class Person
{
  private String name;
  private int age;
  private Address address;

//Constructor 
public Person(String name,int age)
{
  this.name=name;
  this.age=age;
  // Passing this as an argument to the Address constructor
  this.address=new Address(this);
  
  System.out.println("Person Object created:"+this.name);
}

// A method in Person class to display person details
public void displayPersonDetail()
{ 
   System.out.println("Name:"+this.name+ ", Age:"+this.age); 
}
}

class Address
{
  public Address(Person p)
  {
     System.out.println("Address object created for the person:");
	 
	 // Calling a method from the Person class using the received instance
        p.displayPersonDetail();
  }
}
public class ThisKeyword
{
  public static void main(String x[])
  {
     Person p=new Person("abc",28);
  }
}

/* Output:
Address object created for the person:
Name:abcAge:28
Person Object created:abc
*/