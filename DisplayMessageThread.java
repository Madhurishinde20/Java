class DisplayMessage implements Runnable {
    public void run() {
        System.out.println("Hello from the DisplayMessage thread!");
    }
}
public class DisplayMessageThread {
	public static void main(String[] args) {
        // Create an instance of DisplayMessage
        DisplayMessage displayMessage = new DisplayMessage();

        // Create a Thread and pass DisplayMessage as the target
        Thread thread = new Thread(displayMessage);

        // Start the thread
        thread.start();
	}
}

/*
OUTPUT-
Hello from the DisplayMessage thread!
 */