package multithreading;

public class Anonymous {
	public static void main(String[] args) {
		Thread a=new Thread() {
			public void run() {
			for(int i=1;i<=5;i++)
				System.out.println("thraed");
			
			}
		};
		Thread a1=new Thread() {
			public void run() {
			for(int i=1;i<=5;i++)
				System.out.println("hello");
			
			}
		};
		Thread a11=new Thread() {
			public void run() {
			for(int i=1;i<=5;i++)
				System.out.println("hii");
			
			}
		};
	a.start();
	a1.start();
	a11.start();
//		Runnable b=new Runnable() {
//			public void run() {
//				for(int i=1;i<=5;i++)
//					System.out.println("runnable");	
//			}
//			
//		};
//		Thread c=new Thread(b);
//		c.start();
	}

}
