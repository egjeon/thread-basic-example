package SynchronizedExample;

public class MyThread2 implements Runnable{
	Counter c;
	
	public MyThread2(Counter c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			c.increment();
		}
	}

}
