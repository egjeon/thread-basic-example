package ThreadInterruptedExample;

public class MyThread implements Runnable{
	Counter c;
	public MyThread(Counter c) {
		this.c = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 1000000; i++) {
			c.increment();
		}
	}
	
}
