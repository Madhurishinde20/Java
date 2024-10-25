package core_java;
import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		//Taking Input From User

		System.out.println("Enter 1st Number:");
		int a= sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b= sc.nextInt();
		System.out.println("Enter 3rd Number:");
		int c= sc.nextInt();

		//checking largest Number using If-else

		if (a>=b && a>=c) {
			System.out.println("a is largest number");
		}else if(b >= a && b >= c) {
			System.out.println("b is largest number");
		}else {
			System.out.println("c is largest number");
		}
	}


}

/* Enter 1st Number:
5
Enter 2nd Number:
8
Enter 3rd Number:
6
b is largest number
 */