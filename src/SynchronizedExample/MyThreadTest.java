package SynchronizedExample;

public class MyThreadTest {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(new MyThread1(c));t1.start();
		Thread t2 = new Thread(new MyThread2(c));t2.start();
		
		t1.join(); t2.join();
		
		System.out.println(c.value());
				
	}
}
