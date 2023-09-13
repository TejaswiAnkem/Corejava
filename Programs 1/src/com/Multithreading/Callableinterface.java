package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callableinterface implements Callable<Object> {

	@Override
	public Object call() throws Exception {
	System.out.println("callable");
		return "object";
	}
public static void main(String[] args) throws InterruptedException, ExecutionException {
	Callableinterface a=new Callableinterface();
	
	ExecutorService exService=Executors.newFixedThreadPool(10);
	
	for(int i=1;i<=10;i++) {
	Future<Object> submit = exService.submit(a);
	System.out.println(submit.get().toString());
	}
		exService.shutdown();
	}

}
