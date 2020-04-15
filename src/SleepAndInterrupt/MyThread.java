package SleepAndInterrupt;

public class MyThread extends Thread{
	Thread thdNext = null;
	public MyThread(String szName) {
		super(szName);
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				System.out.print(getName() + " ");
				if(thdNext.isAlive())
					thdNext.interrupt();
			}
		}
	}
	public void setNextThread(Thread t) {
		thdNext = t;
	}
}
