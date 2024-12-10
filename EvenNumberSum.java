import java.util.ArrayList;
public class EvenNumberSum
{
 public static void main (String x[])
 {
    ArrayList<Integer>number=new ArrayList<>();
	number.add(10);
	number.add(15);
	number.add(22);
	number.add(33);
	number.add(40);
	
	int sumOfEven = calculateSumOfEven(number);
	System.out.println("The sum of even number in the list is :"+sumOfEven);
 }
 
  public static int calculateSumOfEven(ArrayList<Integer>number)
  {
     int sum=0;
	 for(int i=0;i<number.size();i++)
	 {
	   if(number.get(i)%2==0)
	   {
	     sum+=number.get(i);
	   }
	 }
	 return sum;
  }
 }