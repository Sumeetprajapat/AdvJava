package threads;

public class MyThread1 extends Thread {
	public void run() {
		System.out.println("Thread is running....");
		synchronized (ThreadStatesExample.class) {
			try {
				Thread.sleep(2000);
				ThreadStatesExample.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread is awake");

	}
}
