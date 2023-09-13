package Exceptions;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block start");
			String s = null;
			int i = s.length();
			System.out.println("try block end");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		System.out.println("cleaning done");
		}	
		System.out.println("main( ) method ended...");
	
	}
}
