package SynchronizedExample;

public class MyThread1 implements Runnable{
	Counter c;
	
	 public MyThread1(Counter c) {
		
		 this.c = c;
	}
	@Override
	public void run() {
		for(int i=0; i<998; i++) {
			c.decrement();
		}
	}

}
