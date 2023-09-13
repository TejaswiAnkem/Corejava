package multithreading;

public class Yielddemo {
public static void main(String[] args) {
	ThreadYield v=new ThreadYield();
	
	
	Thread b=new Thread(v);
	b.setPriority(1);
	
	Thread c=new Thread(v);
	c.setPriority(10);
	
	Thread c1=new Thread(v);
	c1.setPriority(10);
	
	b.start();//1
	c.start();//2
	c1.start();//3
	
	
}

}
