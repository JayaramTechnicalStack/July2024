package basic;

import java.util.Scanner;

public class ExceptionTest {
	
	public void test() {
		System.out.println("inside test");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExceptionTest t = new ExceptionTest();
		
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		
		int b = sc.nextInt();
		
		try {
			
		int c = a/b;
		String s = null;
		System.out.println(s.length());
		System.out.println("C value is :" +c);
		
		}catch(ArithmeticException ae)
		{
			System.out.println("inside AE catch block executed ");
			ae.printStackTrace();
		}catch(NullPointerException ne) {
			System.out.println("inside NE catch block executed ");
			ne.printStackTrace();
		}
		
		catch(Exception e) {
			System.out.println("inside Generic Exception catch block executed ");
			e.printStackTrace();
		}
		
		System.out.println("Welcome to Exception Handling Concept");
		System.out.println("CheckedExceptions and UncheckedExceptions");
		t.test();

	}

}
