package multithreading;

public class Threadmethods2 extends Threadmethods {
	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+":"+i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
