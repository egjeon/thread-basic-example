package ThreadCreateExample;

public class MyThreadTest1 {
	public static void main(String[] args) {
	  System.out.println("Main Thread");
	  MyThread1 thread1 = new MyThread1();
	  MyThread1 thread2 = new MyThread1();
	  thread1.start();
	  thread2.start();
	}
}
