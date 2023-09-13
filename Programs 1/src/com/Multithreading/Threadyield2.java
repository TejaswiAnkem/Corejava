package multithreading;

public class Threadyield2 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
		Thread.yield();
	}
	

}
