package SleepAndInterrupt;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread my_thread1 = new MyThread("thd1");
		MyThread my_thread2 = new MyThread("thd2");
		MyThread my_thread3 = new MyThread("thd3");
		
		my_thread1.setNextThread(my_thread2);
		my_thread2.setNextThread(my_thread3);
		my_thread3.setNextThread(my_thread1);
		my_thread1.start(); my_thread2.start();my_thread3.start();
		
		try {
			my_thread1.interrupt();
			my_thread1.join(); my_thread2.join();
			my_thread3.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("main");
	}
}
