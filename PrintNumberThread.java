class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class PrintNumberThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create and start the thread
        PrintNumbers thread = new PrintNumbers();
        thread.start();
	}

}
/*OUTPUT-
1
2
3
4
5
6
7
8
9
10*/
