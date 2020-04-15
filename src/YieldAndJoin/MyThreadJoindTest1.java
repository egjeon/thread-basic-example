package YieldAndJoin;

public class MyThreadJoindTest1 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread(); t1.start();
		Thread t2 = new MyThread(); t2.start();
		
		t1.join();t2.join();
		//t1 ,t2의 스레드가 dead가 되고난 후 main thread를 실행 , t1,t2를 기다리겠다. 라는의미
		
		System.out.println("main thread");
	}
}
