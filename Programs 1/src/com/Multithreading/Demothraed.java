package multithreading;

public class Demothraed {
	public static void main(String[] args) throws InterruptedException{
		
		Threadmethods a=new Threadmethods();//objects creation for current class
		Threadmethods2 b=new Threadmethods2();
         Thread3 c=new Thread3();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		
		
		t2.start();
		t2.setName("second thread");
		
		t1.start();
		t1.setName("first thread");
		
		t3.start();
		t3.setName("third thread");

	}
}

