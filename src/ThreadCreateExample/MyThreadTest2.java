package ThreadCreateExample;

public class MyThreadTest2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2(),"thread-title1");
		t1.start();
		Thread t2 = new Thread(new MyThread2(),"thread-title2");
		t2.start();
		
		System.out.println("main thread");
	}
}
