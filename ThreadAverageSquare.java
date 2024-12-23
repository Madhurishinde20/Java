

public class ThreadAverageSquare {
	
static int[]arr= {1,20,50,15,30};
static final Object lock=new Object();

static class AvgThread extends Thread
{
	public void run()
	{
		synchronized(lock)
		{
		  int sum=0;
		  for(int i=1;i<10;i++) {
			  sum+=1;
		  }
		  double average=sum/10.0;
		  System.out.println("Average of first 10 numbers:" +average);
		  lock.notify();
		}
	}
}
 static class SquareThread extends Thread{
	 public void run() {
		 synchronized(lock) {
			 
			System.out.println("Squares of numbers in array:");
			for(int i=0;i<arr.length;i++) {
				int num=arr[i];
				System.out.println(num + " Square = " + (num*num));
			}	 
		 }
	 }
 }
 public static void main(String[] args)
 {
	 Thread a = new AvgThread();
	 Thread a2 =new SquareThread();
	 
	 a.start();
	 a2.start();
 }
}

/*OUTPUT:
Squares of numbers in array:
1 Square = 1
20 Square = 400
50 Square = 2500
15 Square = 225
30 Square = 900
Average of first 10 numbers:0.9
*/
