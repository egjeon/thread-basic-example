package SynchronizedExample;

public class Counter {
	private int c = 0;
	public synchronized void increment() {
		c++;
	}
	synchronized public void decrement() {
		c--;
	}
	public int value() {
		return c;
	}
}
