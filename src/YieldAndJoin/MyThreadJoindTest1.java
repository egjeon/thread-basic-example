package YieldAndJoin;

public class MyThreadJoindTest1 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread(); t1.start();
		Thread t2 = new MyThread(); t2.start();
		
		t1.join();t2.join();
		//t1 ,t2�� �����尡 dead�� �ǰ� �� main thread�� ���� , t1,t2�� ��ٸ��ڴ�. ����ǹ�
		
		System.out.println("main thread");
	}
}
