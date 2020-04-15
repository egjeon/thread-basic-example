package ThreadInterruptedExample;

public class MyThread1 implements Runnable{
	Counter c;

	public MyThread1(Counter c) {
		this.c = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 100000; i++) {
			c.decrement();
		}
	}
	
	
}
