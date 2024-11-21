public class SmallestElementArray
{
 public static void main(String x[])
 {
	// Predefined array
  int a []={5,1,3,2,3};
  
    // Find the smallest element
  int smallest=a[0];
  
  for(int i=1;i<a.length;i++)
  {
      if(a[i]< smallest)
	  {
	     smallest=a[i];
	  }
  }
    // Output the smallest element
  System.out.println("The smallest element in teh array is: "+smallest);
 }
 }
 
 /* output:
  The smallest element in teh array is: 1
  */