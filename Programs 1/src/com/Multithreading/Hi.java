package multithreading;

public class Hi extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println("thread class"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Hi a= new Hi();

		Thread b=new Thread(a);
		b.start();
		Thread b1=new Thread(a);
		b1.start();
		Thread b2=new Thread(a);
		b2.start();
		for(int i=1;i<=5;i++) 
			System.out.println("this is main");
	}

}
