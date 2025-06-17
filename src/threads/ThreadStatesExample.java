package threads;

public class ThreadStatesExample {
	public static void main(String[] args) throws InterruptedException {
		Thread th = new MyThread1();
		System.out.println("Thread State: " + th.getState());
		th.start();
		System.out.println("Thread State: " + th.getState());
		Thread.sleep(1000);
		System.out.println("Thread State: " + th.getState());
		synchronized (ThreadStatesExample.class) {
			ThreadStatesExample.class.notify();
		}
		Thread.sleep(1000);
		System.out.println("Thread State: " + th.getState());
	}

}
