package Exceptions;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block start");
			String s = null;
			int i = s.length();
			System.out.println("try block end");
		} catch (NullPointerException e) {
			System.out.println("in catch block");
			e.printStackTrace();//method to shows which exception is occured
		}
		System.out.println("main( ) method ended...");
	}
}

