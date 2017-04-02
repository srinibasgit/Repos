package threads.communication;

/**
 * This is a class which has a synchronized method which makes sure that only
 * one thread enters that method for that object.
 */

public class Processor extends Thread {
	String newLine = System.getProperty("line.separator");

	public void Produce() {
		System.out.println("Producer thread running" + newLine);
		synchronized (this) {
			// when wait() is called the thread will be released and Consume()
			// method will be called
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Producer complete" + newLine);
	}

	public void Consume() {

		try {
			Thread.sleep(5000);
			synchronized (this) {
				System.out.println("Consume notifying Producer !!!" + newLine);
				// after notify() is called the statement after wait()
				// will be executed
				notify();
			}
		} catch (InterruptedException e) {
		}

		System.out.println("Producer complete" + newLine);
	}
}