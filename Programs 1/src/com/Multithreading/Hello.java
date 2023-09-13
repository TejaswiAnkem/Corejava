package multithreading;

public class Hello extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("this is extendend class"+Thread.currentThread().getName());
	}
	
	

}
