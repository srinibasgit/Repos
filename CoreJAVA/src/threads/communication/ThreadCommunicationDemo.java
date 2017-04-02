package threads.communication;

/**
 * Inter-thread communication in java is achieved using wait() and notify()
 * methods - calling wait() will stop the execution of the current thread on
 * that line release the thread - and wait for the thread to call notify()
 * method.
 */
public class ThreadCommunicationDemo {
	static String newLine = System.getProperty("line.separator");

	public static void main(String[] args) {
		System.out.println("Inter-thread communication in Java !!!" + newLine);
		final Processor processor = new Processor();

		// creating a new thread which will call the produce method
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				processor.Produce();
			}
		});

		// creating another thread, which will call the consume method
		// which inturn will notify the above thread.

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				processor.Consume();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}
	}
}