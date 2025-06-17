package threads;

public class MyThread implements Runnable {
	public void run() {
		System.out.println("Running....");
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
//		mt.start();
		Thread th = new Thread(mt);
		th.start();
		System.out.println("Main Thread");
	}
}
