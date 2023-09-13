package multithreading;

public class Synchromthd implements Runnable{
		@Override
		public void run() {
			synchronized (this)
		 {
			for(int i=1;i<=5;i++)
				System.out.println(Thread.currentThread().getName()+"this is synchronized"+"synchro");
		}
			
			for(int i=1;i<=6;i++)
				System.out.println(Thread.currentThread().getName());
		}

		
		public static void main(String[] args) {
			Synchromthd d = new Synchromthd();

			Thread t1 = new Thread(d);
			t1.setName("Thread-1");
		    t1.start();
			/*
			 * // Thread t2 = new Thread(d); t2.setName("Thread-2"); t2.start(); //
			 *///			Thread t3=new Thread(d);
//			t3.start();
//			t3.setName("thread 3");
		}

		}
	


