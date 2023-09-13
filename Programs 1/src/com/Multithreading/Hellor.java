package multithreading;

public class Hellor implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Hellor a=new Hellor();
		a.run();
		
		Thread b=new Thread(a);
		b.start();
		b.setPriority(10);
		Thread b1=new Thread(a);
		b1.start();
		
		Thread b11=new Thread(a);
		b11.start();
		b11.setPriority(5);
		for(int i=1;i<=5;i++)
			System.out.println("this is main method execution");
	}
}
